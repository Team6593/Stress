package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;
import org.usfirst.frc.team6593.robot.commands.TankDrive;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	public SpeedController rightSC = new Spark(RobotMap.rightMotor);
	public SpeedController leftSC = new Spark(RobotMap.leftMotor);
	private RobotDrive robotdrive = new RobotDrive(rightSC, leftSC);
	
	public static ADXRS450_Gyro gyro= new ADXRS450_Gyro();
	public static Ultrasonic rangeFinder = new Ultrasonic(1,1);
	
	
	
	public DriveTrain(){
		super();
		LiveWindow.addActuator("DriveTrain", "RightSpeedController", (Spark) rightSC);
		LiveWindow.addActuator("DriveTrain", "LeftSpeedController", (Spark) leftSC);
		LiveWindow.addSensor("DriveTrain", "Gyro", gyro);
		LiveWindow.addSensor("DriveTrain", "UltraSonic", rangeFinder);

		
	}
	
	public void drive(double leftSpeed, double rightSpeed){
		robotdrive.tankDrive(-leftSpeed, -rightSpeed);
	}

	
	public void reset() {
		gyro.reset();
	}
	
	public void stop(){

		robotdrive.drive(0,0);
	}
	
	public void DriveTrainSetSpeed(double speed1, double speed2){
		robotdrive.drive(-speed1, -speed2);
	}
	
	
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new TankDrive());
    }
}

