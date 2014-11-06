package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Programming
 */

public class SolveBasicMaze extends CommandBase 
{
    //private boolean isfinished = false;
    private double distance;
    private static final int DIST_GAP = 20;
    private boolean lturning;
    private boolean finished;
    public SolveBasicMaze() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(rangefinder);
        requires(drivesystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
        distance = rangefinder.getDistance();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        SmartDashboard.putNumber("Range",rangefinder.getDistance());
        int turnstate = 0;
        /*
        0 = cleared
        1 = just turned right
        2 = just 180'd
        */
        finished = false;
        while(!finished)
        {
            lturning = drivesystem.getTurning();
            while(!lturning)
            {
                drivesystem.driveForwardSlowly();
                if (checkDist() && turnstate != 1)
                {
                    turnstate = 1;
                    drivesystem.turnRight();
                    lturning = drivesystem.getTurning();
                    continue;
                }
                if (checkDist() && turnstate != 2)
                {
                    turnstate = 2;
                    drivesystem.turn180();
                    lturning = drivesystem.getTurning();
                    continue;
                }
                if (checkDist() && turnstate != 3)
                {
                    turnstate = 0;
                    drivesystem.turnLeft();
                }
                lturning = drivesystem.getTurning();
            }
        }
    }
    private boolean checkDist()
    {
        return (distance < DIST_GAP);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return finished;
    }

    // Called once after isFinished returns true
    protected void end() {
        //drivesystem.chassis.free();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        drivesystem.stop();
        //drivesystem.chassis.free();
    }
    public void setTurning(boolean turning)
    {
        this.lturning = turning;
    }
}