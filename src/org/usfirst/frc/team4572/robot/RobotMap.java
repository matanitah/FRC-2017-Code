package org.usfirst.frc.team4572.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	
	//MOTORS
	public final static int FRONT_LEFT_MOTOR_PORT = 0;
	public final static int FRONT_RIGHT_MOTOR_PORT = 2;
	public final static int BACK_LEFT_MOTOR_PORT = 1;
	public final static int BACK_RIGHT_MOTOR_PORT = 3;
	public final static int BALL_HOPPER_MOTOR_PORT = 4;
	public final static int ROPE_CLIMBER_MOTOR = 5;

	
	//CONTROLLER
	public static int CONTROLLER_PORT = 0;

	
	//SENSORS
	public static int GYROSCOPE_PORT = 0;
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
