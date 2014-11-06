/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Relay;

/**
 *
 * @author Programming
 */
public class TeamLights extends CommandBase {
    boolean isfinished = false;
    public TeamLights() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(underglowlightsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        if (underglowlightsystem.blight == true)
            underglowlightsystem.uglowspike.set(Relay.Value.kForward);
        else if (underglowlightsystem.rlight == true)
            underglowlightsystem.uglowspike.set(Relay.Value.kReverse);
        else 
            underglowlightsystem.uglowspike.set(Relay.Value.kOff);
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
    }
}
