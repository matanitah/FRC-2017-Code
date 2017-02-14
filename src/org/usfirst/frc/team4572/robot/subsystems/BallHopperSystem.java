package org.usfirst.frc.team4572.robot.subsystems;

import org.usfirst.frc.team4572.robot.RobotMap;
import org.usfirst.frc.team4572.robot.commands.BallHopperCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallHopperSystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static Spark getHopperMotor(){
		return hopperMotor;
		
	}
	public static Spark hopperMotor = new Spark(RobotMap.BALL_HOPPER_MOTOR_PORT);
	//public static Encoder encoder = new Encoder(RobotMap.ENOCODER_PORT_1, RobotMap.ENCODER_PORT_2, false, Encoder.EncodingType.k4X);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new BallHopperCommand());
    }
}

