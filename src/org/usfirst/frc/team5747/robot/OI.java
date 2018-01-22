package org.usfirst.frc.team5747.robot;

import org.usfirst.frc.team5747.util.XboXUID;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private XboXUID driver = new XboXUID(0);
	
	public OI() {
	}
	



	public double getForwardDriver() {
		return  Math.pow(driver.getLeftY(), 3);
	}

	public double getRotationDriver() {
		return Math.pow(driver.getRightX(), 3);
	}


}