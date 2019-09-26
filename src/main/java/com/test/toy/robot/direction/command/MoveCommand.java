package com.test.toy.robot.direction.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.Robot;

public class MoveCommand extends Command {
    private final Logger log = LoggerFactory.getLogger(MoveCommand.class);

    @Override
    public void execute(Robot robot, Report report) {
        if (!robot.isOnTable()) {
            log.debug("Move command ignored");
        } else {
            switch (robot.getCardinalDirection()) {
                case NORTH:
                    if (robot.getYPosition() < Robot.MAX_POSITION) {
                        robot.increaseYPosition();
                        log.debug("The robot is moving");

                    } else {
                        log.debug("Move command ignored");
                    }
                    break;

                case SOUTH:
                    if (robot.getYPosition() > Robot.MIN_POSITION) {
                        robot.decreaseYPosition();
                        log.debug("The robot is moving");
                    } else {
                        log.debug("Move command ignored");
                    }
                    break;

                case EAST:
                    if (robot.getXPosition() < Robot.MAX_POSITION) {
                        robot.increaseXPosition();
                        log.debug("The robot is moving");
                    } else {
                        log.debug("Move command ignored");
                    }
                    break;

                case WEST:
                    if (robot.getXPosition() > Robot.MIN_POSITION) {
                        robot.decreaseXPosition();
                        log.debug("The robot is moving");
                    } else {
                        log.debug("Move command ignored");
                    }
                    break;
            }

        }
    }
}
