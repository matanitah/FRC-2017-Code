package org.usfirst.frc.team4572.robot.subsystems;

import org.usfirst.frc.team4572.robot.OI;
import org.usfirst.frc.team4572.robot.Robot;
import org.usfirst.frc.team4572.robot.RobotMap;
import org.usfirst.frc.team4572.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public Spark frontLeftMotor = new Spark(RobotMap.FRONT_LEFT_MOTOR_PORT);
	public Spark frontRightMotor = new Spark(RobotMap.FRONT_RIGHT_MOTOR_PORT);
	public Spark backLeftMotor = new Spark(RobotMap.BACK_LEFT_MOTOR_PORT);
	public Spark backRightMotor = new Spark(RobotMap.BACK_RIGHT_MOTOR_PORT);
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new DriveCommand());
	}
	public Spark getFrontLeftMotor() {
		return frontLeftMotor;
	}
	public Spark getFrontRightMotor(){
		return frontRightMotor;
	}
	public Spark getBackLeftMotor(){
		return backLeftMotor;
	}
	public Spark getBackRightMotor(){
		return backRightMotor;
	}
	public static void driveMecanum(){
		 Robot.robotDrive.mecanumDrive_Cartesian(OI.getXAxis(), OI.getYAxis(), OI.getZAxis(), OI.getGyro());
	}
}
