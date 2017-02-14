
package org.usfirst.frc.team4572.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4572.robot.subsystems.BallHopperSystem;
import org.usfirst.frc.team4572.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team4572.robot.subsystems.GyroSystem;
import org.usfirst.frc.team4572.robot.subsystems.RopeClimberSystem;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static DriveSubsystem driveSubsystem;
	public static GyroSystem gyroSystem;
	public static BallHopperSystem ballHopperSystem;
	public static RopeClimberSystem ropeClimberSystem;
	public static RobotDrive robotDrive;
	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();
	public static OI oi;


	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		//chooser.addDefault("Default Auto", new DriveCommand());
		driveSubsystem = new DriveSubsystem();
		gyroSystem = new GyroSystem();
		ballHopperSystem = new BallHopperSystem();
		ropeClimberSystem = new RopeClimberSystem();
		robotDrive = new RobotDrive(driveSubsystem.frontLeftMotor, driveSubsystem.backLeftMotor, driveSubsystem.frontRightMotor, driveSubsystem.backRightMotor);
		oi = new OI();
		//robotDrive.setInvertedMotor(MotorType.kFrontLeft, true);
		robotDrive.setInvertedMotor(MotorType.kFrontRight, true);
		//robotDrive.setInvertedMotor(MotorType.kRearLeft, true);
		robotDrive.setInvertedMotor(MotorType.kRearRight, true);
		robotDrive.setExpiration(0.1);
		CameraServer.getInstance().startAutomaticCapture();
		SmartDashboard.putData("Auto mode", chooser);
		
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autonomousCommand = (Command) chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		driveSubsystem.frontLeftMotor.set(0.5);
		driveSubsystem.frontRightMotor.set(0.5);
		driveSubsystem.backLeftMotor.set(0.5);
		driveSubsystem.backRightMotor.set(0.5);
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
			Timer.delay(0.005); // wait 5ms to avoid hogging CPU cycles

	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		}
	}
