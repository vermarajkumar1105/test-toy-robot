package com.test.toy.robot.service.impl;

import com.test.toy.robot.direction.command.Command;
import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.Robot;
import com.test.toy.robot.model.SimulationRound;
import com.test.toy.robot.service.RobotSimulationService;
import com.test.toy.robot.utils.CommandFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RobotSimulationServiceImpl implements RobotSimulationService{

    private final Logger log = LoggerFactory.getLogger(RobotSimulationServiceImpl.class);

    @Override
    public Report start(SimulationRound simulationRound) {

        Robot robot = new Robot();

        Report report = new Report();

        for (String commandString : simulationRound.getCommands()) {

            Command command = CommandFactory.getCommand(commandString);

            if (command != null) {

                command.execute(robot, report);

            } else {

                log.debug("Wrong command: " + commandString);
            }
        }

        return report;
    }

}
