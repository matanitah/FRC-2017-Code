package org.usfirst.frc.team4572.robot.subsystems;

import org.usfirst.frc.team4572.robot.RobotMap;
import org.usfirst.frc.team4572.robot.commands.RopeClimberCommand;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class RopeClimberSystem extends Subsystem {
	public static Spark  ropeClimberMotor1 = new Spark(RobotMap.ROPE_CLIMBER_MOTOR_1);
	public static Spark ropeClimberMotor2 = new Spark(RobotMap.ROPE_CLIMBER_MOTOR_2);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static Spark getClimberMotor1(){
		return ropeClimberMotor1;
	}
	public static Spark getClimberMotor2(){
		return ropeClimberMotor2;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new RopeClimberCommand());
    }
}

