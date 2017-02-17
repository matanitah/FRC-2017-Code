package org.usfirst.frc.team4572.robot.commands;

import org.usfirst.frc.team4572.robot.Robot;
import org.usfirst.frc.team4572.robot.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SenseCommand extends Command {

    public SenseCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(DriveSubsystem.sensitivityToggle){
    		DriveSubsystem.sensitivityToggle = !DriveSubsystem.sensitivityToggle;
    		Robot.robotDrive.setSensitivity(0.5);
    	}
    	else{
    		DriveSubsystem.sensitivityToggle = !DriveSubsystem.sensitivityToggle;
    		Robot.robotDrive.setSensitivity(1.0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
