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
	private WPI_TalonSRX leftDrive1;
	private WPI_TalonSRX leftDrive2;
	private WPI_TalonSRX rightDrive1;
	private WPI_TalonSRX rightDrive2;

	public Drivetrain(WPI_TalonSRX leftDrive1, WPI_TalonSRX leftDrive2,WPI_TalonSRX rightDrive1, WPI_TalonSRX rightDrive2) {
		this.leftDrive1 = leftDrive1;
		this.leftDrive2 = leftDrive2;
		this.rightDrive1 = rightDrive1;
		this.rightDrive2 = rightDrive2;
	}

	public void move(double leftSpeed, double rightSpeed) {
		leftDrive1.set(-leftSpeed);
		leftDrive2.set(-leftSpeed);
		rightDrive1.set(rightSpeed);
		rightDrive2.set(rightSpeed);
	}

	

	public void initDefaultCommand() {
		setDefaultCommand(new DriveArcade(Robot.drivetrain, Robot.oi::getForwardDriver, Robot.oi::getRotationDriver));
	}

}
