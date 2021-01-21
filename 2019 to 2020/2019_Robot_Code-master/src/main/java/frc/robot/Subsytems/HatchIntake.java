/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsytems;
/*
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.Commands.HatchIntakeTele;


public class HatchIntake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  ///This is the Bosch motor used in the intake arm lift
  public WPI_TalonSRX bosch = new WPI_TalonSRX(RobotMap.boschMotor);

  ///This is the pneumatic solenoids for the intake system
  DoubleSolenoid topSolenoid = new DoubleSolenoid(RobotMap.leftBackSolenoid1,RobotMap.leftBackSolenoid2);
  DoubleSolenoid bottomSolenoid = new DoubleSolenoid(RobotMap.rightBackSolenoid1,RobotMap.rightBackSolenoid2);

  ///These are the necessary variables to control the hatch
  boolean inPos;

  public HatchIntake(){
    bosch.set(ControlMode.PercentOutput,0);
    topSolenoid.set(Value.kReverse);
    bottomSolenoid.set(Value.kReverse);
  }

  ///This will switch the bosch's position
  public void controlArmPosition(double speed){
    bosch.set(ControlMode.PercentOutput,speed);
  }

  public void setSolenoids(boolean inPos){
    if(inPos){
      topSolenoid.set(Value.kReverse);
      bottomSolenoid.set(Value.kReverse);
    }
    else{
      topSolenoid.set(Value.kForward);
      bottomSolenoid.set(Value.kForward);
    }
    this.inPos = inPos;
    SmartDashboard.putBoolean("Hatch Solenoids Are In: ", inPos);
  }

  public void changeSolenoids(){
    if(inPos){
      setSolenoids(false);
    } else {
      setSolenoids(true);
    }
    inPos = !inPos;
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new HatchIntakeTele());
  }
}
*/