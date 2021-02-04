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
import frc.robot.Commands.CargoIntakeTele;

public class CargoIntake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  ///These are the talons for the cargo intake
  TalonSRX cargoMotor = new TalonSRX(RobotMap.cargoMotor);
  TalonSRX cargoMotor2 = new TalonSRX(RobotMap.cargoMotor2);

  ///This is the constructor
  public CargoIntake(){
    cargoMotor.set(ControlMode.PercentOutput,0);
    cargoMotor2.set(ControlMode.PercentOutput,0);
  }

  ///This sets the intakes percent output
  public void setPercentOutput(double speed){
    cargoMotor.set(ControlMode.PercentOutput, -speed);
    cargoMotor2.set(ControlMode.PercentOutput,-speed);
    SmartDashboard.putNumber("CargoIntakeSpeed", speed);
  }

  ///This stops the motors entirely
  public void stop(){
    setPercentOutput(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new CargoIntakeTele());
  }
}
