package org.usfirst.frc.team4572.robot.subsystems;

import org.usfirst.frc.team4572.robot.OI;
import org.usfirst.frc.team4572.robot.commands.GyroCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GyroSystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public static double getGyroAngle(){
		return OI.analogGyro.getAngle();
	}
	public static void resetGyroAngle(){
		OI.analogGyro.reset();
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new GyroCommand());
    }
}

