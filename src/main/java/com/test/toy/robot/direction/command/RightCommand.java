package com.test.toy.robot.direction.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.toy.robot.constants.CardinalDirection;
import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.Robot;

public class RightCommand extends Command {
    private final Logger log = LoggerFactory.getLogger(RightCommand.class);

    @Override
    public void execute(Robot robot, Report report) {
        if (!robot.isOnTable()) {
            log.debug("Right command ignored");
        } else {
            switch (robot.getCardinalDirection()) {
                case NORTH:
                    robot.setCardinalDirection(CardinalDirection.EAST);
                    break;
                case SOUTH:
                    robot.setCardinalDirection(CardinalDirection.WEST);
                    break;
                case EAST:
                    robot.setCardinalDirection(CardinalDirection.SOUTH);
                    break;
                case WEST:
                    robot.setCardinalDirection(CardinalDirection.NORTH);
                    break;
            }
            log.debug("The robot is rotating 90 degree to " + robot.getCardinalDirection());

        }
    }
}
