package com.test.toy.robot.direction.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.toy.robot.constants.CardinalDirection;
import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.Robot;

public class LeftCommand extends Command {

    private final Logger log = LoggerFactory.getLogger(LeftCommand.class);

    public void execute(Robot robot, Report report) {

        if (!robot.isOnTable()) {
            log.debug("Left command ignored");
        } else {
            switch (robot.getCardinalDirection()) {
                case NORTH:
                    robot.setCardinalDirection(CardinalDirection.WEST);
                    break;
                case SOUTH:
                    robot.setCardinalDirection(CardinalDirection.EAST);
                    break;
                case EAST:
                    robot.setCardinalDirection(CardinalDirection.NORTH);
                    break;
                case WEST:
                    robot.setCardinalDirection(CardinalDirection.SOUTH);
                    break;
            }
            log.debug("The robot is rotating 90 degree to " + robot.getCardinalDirection());
        }

    }
}
