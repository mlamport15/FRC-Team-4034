package edu.wpi.first.wpilibj.templates.commands;

/**
 * @author Programming
 */
public class ArcadeDrive extends CommandBase {
    
    public ArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //chassis = DriveSystem.getInstance();
        requires(drivesystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        //drivesystem.chassis.drive(oi.drivestick.getY(), oi.drivestick.getX()*-1);
        drivesystem.chassis.drive(oi.XBOXcontroller.getY(), oi.XBOXcontroller.getX()*-1);
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
