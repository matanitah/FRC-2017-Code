package org.usfirst.frc.team4572.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4572.robot.OI;
import org.usfirst.frc.team4572.robot.Robot;
import org.usfirst.frc.team4572.robot.subsystems.DriveSubsystem;

/**
 *
 */
public class DriveCommand extends Command {
	public DriveCommand() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.driveSubsystem);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		boolean sensitivityToggle = true;
		DriveSubsystem.driveMecanum();
		if(OI.logitech.getRawButton(6)){
			if(sensitivityToggle){
				sensitivityToggle = !sensitivityToggle;
			Robot.robotDrive.setSensitivity(0.5);
			}else{
			sensitivityToggle = !sensitivityToggle;
			Robot.robotDrive.setSensitivity(1.0);
			}
		}

	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
