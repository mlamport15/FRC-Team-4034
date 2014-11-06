
package edu.wpi.first.wpilibj.templates.commands;
/**
 * @author Programming
 */
public class OperatorControl extends CommandBase {
    
    public OperatorControl() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(throwersystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        double joyYValue = oi.throwstick.getY();
        throwersystem.throwingjags.set( -1*joyYValue*joyYValue*joyYValue );
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
        //throwersystem.throwingjags.free();
    }
}