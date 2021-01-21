/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsytems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.Commands.DriveBaseTele;

/**
 * Add your docs here.
 */
public class DriveBase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  ///These are the DriveBase Motors

  TalonSRX leftMaster = new TalonSRX(RobotMap.leftMaster);
  TalonSRX leftFollower = new TalonSRX(RobotMap.leftFollower);
  TalonSRX leftFollower2 = new TalonSRX(RobotMap.leftFollower2);
  TalonSRX rightMaster = new TalonSRX(RobotMap.rightMaster);
  TalonSRX rightFollower = new TalonSRX(RobotMap.rightFollower);
  TalonSRX rightFollower2 = new TalonSRX(RobotMap.rightFollower2);

  public DriveBase(){
    leftMaster.set(ControlMode.PercentOutput,0);
    leftFollower.set(ControlMode.PercentOutput,0);
    leftFollower2.set(ControlMode.PercentOutput,0);
    rightMaster.set(ControlMode.PercentOutput,0);
    rightFollower.set(ControlMode.PercentOutput, 0);
    rightFollower.set(ControlMode.PercentOutput,0);
  }

  public void percentOutput(double leftSpeed, double rightSpeed){
    leftMaster.set(ControlMode.PercentOutput, -leftSpeed);
    leftFollower.set(ControlMode.PercentOutput, -leftSpeed);
    leftFollower2.set(ControlMode.PercentOutput, -leftSpeed);
    rightMaster.set(ControlMode.PercentOutput, rightSpeed);
    rightFollower.set(ControlMode.PercentOutput, rightSpeed);
    rightFollower2.set(ControlMode.PercentOutput, rightSpeed);
    SmartDashboard.putNumber("leftSpeed%", leftSpeed);
    SmartDashboard.putNumber("rightSpeed%",rightSpeed);
  }

  public void stop(){
    this.percentOutput(0, 0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveBaseTele());
  }
}
