package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.TankDrive;

/**
 * @author Programming
 */
public class DriveSystem extends Subsystem 
{
    public RobotDrive chassis;
    public int drivedist;
    public boolean turning = false;
    //public RobotDrive chassis = new RobotDrive(RobotMap.RIGHTMOTOR,RobotMap.LEFTMOTOR);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DriveSystem()
    {
        chassis = new RobotDrive(RobotMap.RIGHTMOTOR,RobotMap.LEFTMOTOR);
        chassis.setSafetyEnabled(false);
    }
    public void initDefaultCommand()
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new TankDrive());
    }
    public void driveForwardSlowly()
    {
        chassis.drive(-.5,0);
    }
    public void turnRight()
    {
        turning = true;
        chassis.drive(-.5,1);
        Timer.delay(2);
        stop();
        turning = false;
    }
    public void turnLeft()
    {
        chassis.drive(-.5,-1);
        Timer.delay(5);
        stop();
    }
    public void turn180()
    {
        turnRight();
        turnRight();
    }
    public void stop()
    {
        chassis.drive(0,0);
    }
    public void fullForward()//full speed at (-1,0)
    {
       chassis.drive(-.75,0);
      
    }
    public void fullBackward()
    {
        chassis.drive(.75,0);
    }
   
     public void rightTurn()
    {         
        chassis.drive(-.75,-1);
    }
    public void leftTurn()
    {
        chassis.drive(-.75,1);
    }
    public boolean getTurning()
    {
        return turning;
    }
    public void rave()
    {
        chassis.drive(-.5, 1);
        Timer.delay(1);
        chassis.drive(0,0);
        Timer.delay(1);
        chassis.drive(-.5, 1);
        Timer.delay(.5);
        chassis.drive(0,0);
        Timer.delay(.5);
        chassis.drive(-.5, 1);
        Timer.delay(.5);
        chassis.drive(0,0);
        Timer.delay(.5);
        chassis.drive(-.5, -1);
        Timer.delay(1);
        chassis.drive(0,0);
        Timer.delay(1);
        chassis.drive(-.5, -1);
        Timer.delay(.5);
        chassis.drive(0,0);
        Timer.delay(.5);
        chassis.drive(-.5, -1);
        Timer.delay(.5);
        chassis.drive(0,0);
        Timer.delay(.5);
    }
}