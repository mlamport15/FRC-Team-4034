package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.DisplayRange;

/**
 * @author Programming Team
 */

public class RangeFinder extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public double volt, inches;
    AnalogChannel range = new AnalogChannel(5);
    
    public RangeFinder()
    {
    }
    public double getDistance()
    {
        volt = range.getAverageVoltage();
        inches = volt/0.009766;
        return inches;
        
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        getDistance();
        setDefaultCommand(new DisplayRange());
      
        
    }
}
