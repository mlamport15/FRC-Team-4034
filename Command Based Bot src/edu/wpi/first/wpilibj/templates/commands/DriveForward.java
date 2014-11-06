/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.templates.commands.CommandBase.drivesystem;
/**
 *
 * @author Programming
 */
public class DriveForward extends CommandBase {
    private boolean isFinished = false;
 
    public DriveForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivesystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {

    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivesystem.fullForward();
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isFinished=true;
    }

    // Called once after isFinished returns true
    protected void end() {

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
 
    }
}
