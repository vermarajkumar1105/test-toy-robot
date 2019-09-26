package com.test.toy.robot.direction.command;


import com.test.toy.robot.model.Report;
import com.test.toy.robot.model.Robot;

public abstract class Command {

    public abstract void execute(Robot robot, Report report);
}
