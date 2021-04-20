// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
  /** Creates a new Elevator. */
  public static WPI_TalonSRX elevator;

  public Elevator() {
    elevator = new WPI_TalonSRX(7);


  }

  public static void go(double power) {
    elevator.set(ControlMode.PercentOutput, power);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
