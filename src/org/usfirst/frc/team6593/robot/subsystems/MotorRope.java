package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;
import org.usfirst.frc.team6593.robot.commands.Climbing;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class MotorRope extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private static SpeedController ropeClimb;
    
	public MotorRope(){
		ropeClimb = new Spark(RobotMap.ropeMotor);
	}
	
	public static void ropeStart(double speed) {
	ropeClimb.set(speed);
	}
	public static void ropeStop() {
		ropeClimb.set(0);
	}
	

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Climbing());
    }
}

