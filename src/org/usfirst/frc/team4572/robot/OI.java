package org.usfirst.frc.team4572.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
    public static Joystick playstation = new Joystick(RobotMap.PLAYSTATION_PORT);
    public static Joystick logitech = new Joystick(RobotMap.LOGITECH_PORT);
	public static Button ropeButton = new JoystickButton(playstation, 1);
	public static Button hopperButton = new JoystickButton(playstation, 2);
    public static AnalogGyro analogGyro = new AnalogGyro(RobotMap.GYROSCOPE_PORT);
    public static double getXAxis(){
    	return playstation.getX();
    }
    public static double getYAxis(){
    	return playstation.getY();
    }
    public static double getZAxis(){
    	return playstation.getZ();
    }
    public static double getGyro(){
    	return analogGyro.getAngle();
    }
	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:
	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
