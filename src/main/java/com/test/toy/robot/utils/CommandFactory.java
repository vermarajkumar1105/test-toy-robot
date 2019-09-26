package com.test.toy.robot.utils;

import com.test.toy.robot.constants.CommandType;
import com.test.toy.robot.constants.PlaceMatcher;
import com.test.toy.robot.direction.command.Command;
import com.test.toy.robot.direction.command.LeftCommand;
import com.test.toy.robot.direction.command.MoveCommand;
import com.test.toy.robot.direction.command.PlaceCommand;
import com.test.toy.robot.direction.command.ReportCommand;
import com.test.toy.robot.direction.command.RightCommand;

public class CommandFactory {

    public static Command getCommand(String commandString) {

        if (commandString.matches(PlaceMatcher.PLACE_COMMAND_REGEX)) {
            return new PlaceCommand(commandString);

        } else if (commandString.equals(CommandType.LEFT.name())) {
            return new LeftCommand();

        } else if (commandString.equals(CommandType.RIGHT.name())) {
            return new RightCommand();

        } else if (commandString.equals(CommandType.REPORT.name())) {
            return new ReportCommand();

        } else if (commandString.equals(CommandType.MOVE.name())) {
            return new MoveCommand();

        }
        return null;
    }
}
