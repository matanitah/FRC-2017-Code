package org.usfirst.frc.team4572.robot.commands;

import org.usfirst.frc.team4572.robot.OI;
import org.usfirst.frc.team4572.robot.Robot;
import org.usfirst.frc.team4572.robot.subsystems.RopeClimberSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RopeClimberCommand extends Command {

    public RopeClimberCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.ropeClimberSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boolean climberButton = OI.playstation.getRawButton(2);
    	if(climberButton)
    		RopeClimberSystem.getClimberMotor().set(1.0);
    		else
    		RopeClimberSystem.getClimberMotor().set(0.0);
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
