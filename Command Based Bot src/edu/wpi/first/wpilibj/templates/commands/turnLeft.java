/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 * @author Programming
 */
public class turnLeft extends CommandBase {
    private boolean isfinished = false;
    public turnLeft() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivesystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivesystem.turnLeft();
        Timer.delay(1);
        drivesystem.stop();
        isfinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isfinished;
    }

    // Called once after isFinished returns true
    protected void end() {
        drivesystem.chassis.free();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
