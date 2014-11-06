package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.DriveBackward;
import edu.wpi.first.wpilibj.templates.commands.DriveForward;
import edu.wpi.first.wpilibj.templates.commands.DriveLeft;
import edu.wpi.first.wpilibj.templates.commands.DriveRight;
import edu.wpi.first.wpilibj.templates.commands.FlashLights;
import edu.wpi.first.wpilibj.templates.commands.setBlueTeam;
import edu.wpi.first.wpilibj.templates.commands.setNoTeam;
import edu.wpi.first.wpilibj.templates.commands.setRedTeam;
import edu.wpi.first.wpilibj.templates.commands.turnRight;
import edu.wpi.first.wpilibj.templates.commands.FlashLightsSlow;
import edu.wpi.first.wpilibj.templates.commands.RaveBot;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    public Joystick drivestick = new Joystick(RobotMap.DRIVESTICK);
    public Joystick throwstick = new Joystick(RobotMap.THROWSTICK);
    public Joystick XBOXcontroller = new Joystick(RobotMap.XBOXCONTROLLER);
    
    //Button trigger = new JoystickButton(XBOXcontroller,1);
    Button button2 = new JoystickButton(XBOXcontroller,2);
    //Button button11 = new JoystickButton(XBOXcontroller,5);
    Button button10 = new JoystickButton(XBOXcontroller,9);
    Button flash = new JoystickButton(XBOXcontroller,3);
    //Button flashslow = new JoystickButton(XBOXcontroller,10);
    Button teamredbutton = new JoystickButton(XBOXcontroller,6);
    Button teambluebutton = new JoystickButton(XBOXcontroller,7);
    Button teamnobutton = new JoystickButton(XBOXcontroller,8);
    Button forward = new JoystickButton(XBOXcontroller,4);
    Button backward = new JoystickButton(XBOXcontroller,1);
    Button left = new JoystickButton(XBOXcontroller,5);
    Button right = new JoystickButton(XBOXcontroller,6);
    Button rave = new JoystickButton(XBOXcontroller,10);
    public OI()
    {
        //trigger.whenPressed(new FullThrow());
        //button2.whenPressed(new ArmAndThrow());
        
        //button11.whenPressed(new turnRight());
        //button10.whenPressed(new SolveBasicMaze());
        
        flash.whenPressed(new FlashLights());
        //flashslow.whenPressed(new FlashLightsSlow());
        
        teamredbutton.whenPressed(new setRedTeam());
        teambluebutton.whenPressed(new setBlueTeam());
        teamnobutton.whenPressed(new setNoTeam());
        
        forward.whileHeld(new DriveForward());
        backward.whileHeld(new DriveBackward());
        left.whileHeld(new DriveLeft());
        right.whileHeld(new DriveRight());
        
        rave.whileHeld(new RaveBot());
        
    
    }
/**    public Joystick getDriveStick()
    {
        return drivestick;
    }
    public Joystick getThrowStick()
    {
        return throwstick;
     * @return        
    */
    public Joystick getXBOXCONTROLLER()
    {
        return XBOXcontroller;

    }
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}