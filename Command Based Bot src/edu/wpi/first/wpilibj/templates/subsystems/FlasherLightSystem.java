/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;

/**
 * @author Programming
 */
public class FlasherLightSystem extends Subsystem {
    public Relay flasherspike = new Relay(RobotMap.FLASHERSPIKE);
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void flash(int times){
        if (CommandBase.underglowlightsystem.rlight){
            for(int counter = 0; counter < times; counter++){
                flasherspike.set(Relay.Value.kForward);
                Timer.delay(.025);
                flasherspike.set(Relay.Value.kOff);
                Timer.delay(.025);
            }
        }
        else if (CommandBase.underglowlightsystem.blight){
            for(int counter = 0; counter < times; counter++){
                flasherspike.set(Relay.Value.kReverse);
                Timer.delay(.025);
                flasherspike.set(Relay.Value.kOff);
                Timer.delay(.025);
            }
        }
        else{
            for(int counter = 0; counter < times; counter++){
                flasherspike.set(Relay.Value.kForward);
                Timer.delay(.025);
                flasherspike.set(Relay.Value.kReverse);
                Timer.delay(.025);
            }
        }
        flasherspike.set(Relay.Value.kOff);
    }
    
    public void flashslow(int times){
        if (CommandBase.underglowlightsystem.rlight){
            for(int counter = 0; counter < times; counter++){
                flasherspike.set(Relay.Value.kForward);
                Timer.delay(.1);
                flasherspike.set(Relay.Value.kOff);
                Timer.delay(.1);
            }
        }
        else if (CommandBase.underglowlightsystem.blight){
            for(int counter = 0; counter < times; counter++){
                flasherspike.set(Relay.Value.kReverse);
                Timer.delay(.1);
                flasherspike.set(Relay.Value.kOff);
                Timer.delay(.1);
            }
        }
        else{
            for(int counter = 0; counter < times; counter++){
                flasherspike.set(Relay.Value.kForward);
                Timer.delay(.1);
                flasherspike.set(Relay.Value.kReverse);
                Timer.delay(.1);
            }
        }
        flasherspike.set(Relay.Value.kOff);
    }
}