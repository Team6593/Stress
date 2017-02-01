package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ShootOut extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private static SpeedController shootBall;
	
	public ShootOut(){
		shootBall = new Spark(RobotMap.shootMotor);
		
		
	}
	public static void ballStart(double speed) {
		shootBall.set(speed);
		}
	
	public static void ballStop() {
			shootBall.set(0);
		}
		

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

