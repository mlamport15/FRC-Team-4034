/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.subsystems.ThrowerSystem;
/**
 *
 * @author Programming
 */
public class DisplayAxis extends CommandBase {
    public DisplayAxis() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(throwersystem);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        SmartDashboard.putNumber("Y_Axis",oi.XBOXcontroller.getY());
        SmartDashboard.putNumber("X_Axis",oi.XBOXcontroller.getX());
        SmartDashboard.putNumber("Z_Axis",oi.XBOXcontroller.getZ());
        SmartDashboard.putNumber("Throttle",oi.XBOXcontroller.getThrottle());
        SmartDashboard.putNumber("5_Axis",oi.XBOXcontroller.getRawAxis(5));
        SmartDashboard.putNumber("Magnitude",oi.XBOXcontroller.getMagnitude());
        SmartDashboard.putNumber("7_Axis",oi.XBOXcontroller.getRawAxis(7));
        
        SmartDashboard.putNumber("Range",rangefinder.getDistance());
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