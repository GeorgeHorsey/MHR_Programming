// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  //declare 
  Spark leftFront;
  Spark rightFront;
  Spark leftBack;
  Spark rightBack; 
  SpeedControllerGroup leftMotors; 
  SpeedControllerGroup rightMotors;
  DifferentialDrive drive; 
  /** Creates a new DriveTrain. */

  public DriveTrain() {
    //instantiate motors 
    leftFront = new Spark(Constants.LEFT_FRONT_MOTOR_CHANNEL); 
    leftFront.setInverted(false);
    rightFront = new Spark(Constants.RIGHT_FRONT_MOTOR_CHANNEL);
    rightFront.setInverted(false);
    leftBack = new Spark(Constants.LEFT_BACK_MOTOR_CHANNEL); 
    leftBack.setInverted(false);
    rightBack = new Spark(Constants.RIGHT_BACK_MOTOR_CHANNEL);
    rightBack.setInverted(false);

    leftMotors = new SpeedControllerGroup(leftFront, leftBack);
    rightMotors = new SpeedControllerGroup(rightFront, rightBack);
    drive = new DifferentialDrive(leftMotors, rightMotors);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveWithJoysticks(XboxController controller, double speed){
    drive.arcadeDrive(controller.getRawAxis(Constants.DRIVER_XBOX_LEFT_Y_AXIS)*speed, controller.getRawAxis(Constants.DRIVER_XBOX_LEFT_X_AXIS)*speed);
  }

  public void driveForward(double speed){
    drive.tankDrive(speed, speed);
  }

  public void stop(){
    drive.stopMotor();
  }
}
