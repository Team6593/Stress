package org.usfirst.frc.team6593.robot.subsystems;

import org.usfirst.frc.team6593.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;


public class Pneumatics {
	private Solenoid pneumaticsActuator;
	
	
	public Pneumatics(Solenoid pneumaticsActuator) {
		this.pneumaticsActuator = new Solenoid(RobotMap.Solenoidport);
		
	}
	public void extendPneumatics() {
		pneumaticsActuator.set(true);
	} 
	public void retractPneumatics() {
		pneumaticsActuator.set(false);
	}
	public boolean isExtended() {
		return pneumaticsActuator.get();
	}
}

