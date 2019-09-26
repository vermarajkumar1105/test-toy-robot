package com.test.toy.robot.direction.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.Robot;

public class ReportCommand extends Command {
    private final Logger log = LoggerFactory.getLogger(ReportCommand.class);

    @Override
    public void execute(Robot robot, Report report) {
        if (!robot.isOnTable()) {
            log.debug("Missing Robot");
            report.addOutput("ROBOT MISSING");
        } else {
            report.addOutput(robot.getCurrentStatus());
        }
    }
}
