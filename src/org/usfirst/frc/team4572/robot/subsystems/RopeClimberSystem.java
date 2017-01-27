package org.usfirst.frc.team4572.robot.subsystems;

import org.usfirst.frc.team4572.robot.RobotMap;
import org.usfirst.frc.team4572.robot.commands.RopeClimberCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RopeClimberSystem extends Subsystem {
	private final Spark  ropeClimberMotor = new Spark(RobotMap.ROPE_CLIMBER_MOTOR);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Spark getClimberMotor(){
		return ropeClimberMotor;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RopeClimberCommand());
    }
}

