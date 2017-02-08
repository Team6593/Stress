package org.usfirst.frc.team6593.robot.commands;

import org.usfirst.frc.team6593.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForwardForXAtYCommand extends Command {
    protected double power;
    protected double time;
    protected double endTime;

    public void DriveStraightForDistance(double power, double timeInMillis) {
        this.power = power;
        this.time = timeInMillis;
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        long startTime = System.currentTimeMillis();
        endTime = startTime + this.time;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.drivetrain.drive(power, power);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return System.currentTimeMillis() >= endTime;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.drivetrain.drive(0, 0);

    }

    protected void interrupted() {
        end();
    }
}
