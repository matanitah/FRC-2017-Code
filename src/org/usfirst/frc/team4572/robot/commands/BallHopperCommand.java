package org.usfirst.frc.team4572.robot.commands;

import org.usfirst.frc.team4572.robot.OI;
import org.usfirst.frc.team4572.robot.Robot;
import org.usfirst.frc.team4572.robot.subsystems.BallHopperSystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BallHopperCommand extends Command {

    public BallHopperCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.ballHopperSystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	BallHopperSystem.encoder.reset();
    	}
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        boolean hopperButton = OI.logitech.getRawButton(1);
       double count = BallHopperSystem.encoder.getDistance();
		System.out.println(count);

    	if(hopperButton){
    		if(count < 61){
    			if(count > 45)
			 BallHopperSystem.getHopperMotor().set(0.5);
    			else if(count > 30)
    				 BallHopperSystem.getHopperMotor().set(0.65);
    			else
    		 BallHopperSystem.getHopperMotor().set(1.0);    				
    		}else
				 BallHopperSystem.getHopperMotor().set(0.0);

    	}
		else{
				 BallHopperSystem.getHopperMotor().set(-0.1);
		 }
//    	}
//    	else if(hopperButto){
//    		BallHopperSystem.getHopperMotor().set(0.01);
//    	}
//    	else if(!hopperButton){
//    		BallHopperSystem.getHopperMotor().set(0.0);
//    		Timer.delay(2.0);
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
