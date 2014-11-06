
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.ArmAndThrow;
import edu.wpi.first.wpilibj.templates.commands.FullThrow;
import edu.wpi.first.wpilibj.templates.commands.DisplayAxis;
//import edu.wpi.first.wpilibj.templates.commands.OperatorControl;

/**
 * @author Programming
 */
public class ThrowerSystem extends Subsystem 
{
    public Jaguar throwingjags = new Jaguar(RobotMap.FIRINGJAGS);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void fullThrow()
    {
        throwingjags.set(1);
        Timer.delay(.8);
        throwingjags.set(0);
        FullThrow.finish();
    }
    public void armAndThrow()
    {
        throwingjags.set(-.20);
        Timer.delay(2);
        throwingjags.set(1);
        Timer.delay(.8);
        throwingjags.set(0);
        ArmAndThrow.finish();
        
    }
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DisplayAxis());
        //setDefaultCommand(new OperatorControl());
    }
    
        
    
}
