/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Programming
 */
public class setBlueTeam extends CommandBase {
    boolean isfinished = false;
    public setBlueTeam() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //requires(underglowlightsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        underglowlightsystem.blight = true;
        underglowlightsystem.rlight = false;
        isfinished = true;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isfinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        isfinished = true;
    }
}
