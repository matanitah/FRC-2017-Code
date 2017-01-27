package org.usfirst.frc.team4572.robot.subsystems;

import org.usfirst.frc.team4572.robot.RobotMap;
import org.usfirst.frc.team4572.robot.commands.RotatorCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RotatorSystem extends Subsystem {
	public static Spark getCameraMotor(){
		return cameraMotor;
	}
	public static Spark cameraMotor = new Spark(RobotMap.CAMERA_MOTOR_PORT);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public void rotateCamera(){
		getCameraMotor().set(0.2);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RotatorCommand());
    }
}

