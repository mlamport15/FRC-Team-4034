package edu.wpi.first.wpilibj.templates.commands;
/**
 * @author Programming
 */
public class FullThrow extends CommandBase {
    
    public static boolean isfinished = false;
    public FullThrow() {
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
        throwersystem.fullThrow();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished()
    {
        return isfinished;
    }
    // Called once after isFinished returns true
    protected void end() 
    {
        //throwersystem.throwingjags.free();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    public static void finish()
    {
        isfinished = true;
    }
}
