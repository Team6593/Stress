package org.usfirst.frc.team6593.robot.commands;

import org.usfirst.frc.team6593.robot.Robot;
import org.usfirst.frc.team6593.robot.subsystems.ShootOut;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shooting extends Command {

    public Shooting() {
    	 requires(Robot.shootOut);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	ShootOut.ballStart(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	ShootOut.ballStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
