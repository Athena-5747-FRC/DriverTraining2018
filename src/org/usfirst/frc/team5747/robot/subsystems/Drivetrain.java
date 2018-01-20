package org.usfirst.frc.team5747.robot.subsystems;

import org.usfirst.frc.team5747.robot.Robot;
import org.usfirst.frc.team5747.robot.commands.DriveArcade;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	public static final double DRIVING_SPEED = 0.5;
	private WPI_TalonSRX leftDrive;
	private WPI_TalonSRX rightDrive;

	public Drivetrain(WPI_TalonSRX leftDrive, WPI_TalonSRX rightDrive) {
		this.leftDrive = leftDrive;
		this.rightDrive = rightDrive;
	}

	public void move(double leftSpeed, double rightSpeed) {
		leftDrive.set(-leftSpeed);
		rightDrive.set(rightSpeed);
	}

	

	public void initDefaultCommand() {
		setDefaultCommand(new DriveArcade(Robot.drivetrain, Robot.oi::getForwardDriver, Robot.oi::getRotationDriver));
	}

}
