/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.Timer;

/**
 *
 * @author Programming
 */
public class AutonomousScore extends CommandBase {
    
    public AutonomousScore() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivesystem);
        requires(throwersystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        //break lock
        throwersystem.throwingjags.set(-.18);
        Timer.delay(.4);
        throwersystem.throwingjags.set(0);
        Timer.delay(.3);
        throwersystem.throwingjags.set(-.25);
        Timer.delay(1.3);
        //lock broken, move forward, and raise arm a bit
        drivesystem.chassis.drive(-0.6, 0.0);
        throwersystem.throwingjags.set(.1);
        Timer.delay(1);
        throwersystem.throwingjags.set(0);
        Timer.delay(1.7);
        //stop
        drivesystem.chassis.drive(0.0, 0.0);
        Timer.delay(.8);
        throwersystem.throwingjags.set(-.23);
        Timer.delay(1.8);
        throwersystem.throwingjags.set(1);
        Timer.delay(.8);
        throwersystem.throwingjags.set(0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
