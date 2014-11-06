package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.TeamLights;

/**
 *
 * @author Programming
 */
public class UnderglowLightSystem extends Subsystem {
    
    public Relay uglowspike = new Relay(RobotMap.UGLOWSPIKE);
    public boolean blight = false,
                   rlight = false;
    // Relay teamcolorsound = new Relay(6);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TeamLights());
    }
    public boolean getblight(){
        return blight;
    }
}
