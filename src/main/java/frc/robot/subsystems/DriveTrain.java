// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.MotorSafety;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.MoveDrive;  

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */
  WPI_TalonSRX masterLeft;
  WPI_TalonSRX follower1Left;
  WPI_TalonSRX follower2Left;
  WPI_TalonSRX masterRight;
  WPI_TalonSRX follower1Right;
  WPI_TalonSRX follower2Right;


  public static DifferentialDrive drive;



  public DriveTrain() {

    masterLeft = new WPI_TalonSRX(3);
    masterLeft.setSafetyEnabled(false);

    follower1Left = new WPI_TalonSRX(1);
    follower1Left.setSafetyEnabled(false);

    follower2Left = new WPI_TalonSRX(2);
    follower2Left.setSafetyEnabled(false);
    

    SpeedControllerGroup left = new SpeedControllerGroup(masterLeft, follower1Left, follower2Left);

    masterRight = new WPI_TalonSRX(8);
    masterRight.setSafetyEnabled(false);

    follower1Right = new WPI_TalonSRX(10);
    follower1Right.setSafetyEnabled(false);
    
    follower2Right = new WPI_TalonSRX(12);
    follower2Right.setSafetyEnabled(false);


    SpeedControllerGroup right = new SpeedControllerGroup(masterRight, follower1Right, follower2Right);

    drive = new DifferentialDrive(left, right);

    setDefaultCommand(new MoveDrive(this)); 
    
  }


  public static void manualDrive(double move, double turn) {

    drive.arcadeDrive(move, turn);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
