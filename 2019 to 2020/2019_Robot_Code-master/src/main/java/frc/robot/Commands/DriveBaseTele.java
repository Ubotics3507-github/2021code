/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.RobotUtil;

public class DriveBaseTele extends Command {

  ///These are the necessary variables for the drive base tele
  double deadZone = 0.2;
  double lHandY;
  double rHandY;
  double x;
  double y;
  double prevLHandY;
  double prevRHandY;

  public DriveBaseTele() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.driveBase);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    prevLHandY = 0;
    prevRHandY = 0;
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // if(Robot.driveTypeChooser.getSelected()=="Tank"){
    //   tank();
    // } else if(Robot.driveTypeChooser.getSelected()=="Arcade"){
    //   arcade();
    // } else if(Robot.driveTypeChooser.getSelected()=="Arcade Split"){
    //   arcadeSplit();
    // }
    arcadeSplit();
  }

  private void tank(){
    ///This executes tank drive using the driver controller
    lHandY = RobotUtil.deadZone(OI.driver.getY(Hand.kLeft),deadZone);
    rHandY = RobotUtil.deadZone(OI.driver.getY(Hand.kRight),deadZone);
    // if(Robot.decelerator.getSelected().equals(true)){
    //   lHandY *= 0.8;
    //   rHandY *= 0.8;
    //   decelerate();
    // }
    Robot.driveBase.percentOutput(lHandY, rHandY);
  }

  private void arcade(){
    ///This executes arcade drive
    x = RobotUtil.deadZone(OI.driver.getX(Hand.kLeft), deadZone);
    y = RobotUtil.deadZone(OI.driver.getY(Hand.kLeft), deadZone);
    lHandY = -RobotUtil.capper(-x + y,2);
    rHandY = -RobotUtil.capper(x + y,2);
    // if(Robot.decelerator.getSelected().equals(true)){
    //   lHandY *= 0.8;
    //   rHandY *= 0.8;
    //   decelerate();
    // }
    Robot.driveBase.percentOutput(lHandY, rHandY);
  }

  private void arcadeSplit(){
    ///This executes arcade drive
    x = RobotUtil.deadZone(OI.driver.getX(Hand.kRight), deadZone);
    y = RobotUtil.deadZone(OI.driver.getY(Hand.kLeft), deadZone);
    lHandY = -RobotUtil.capper(-x + y,2);
    rHandY = -RobotUtil.capper(x + y,2);
    // if(Robot.decelerator.getSelected().equals(true)){
    //   lHandY *= 0.8;
    //   rHandY *= 0.8;
    //   decelerate();
    // }
    Robot.driveBase.percentOutput(lHandY, rHandY);
  }

  // private void decelerate(){
  //   //Decelerate helps stop robot from tipping
  //   if(prevLHandY-lHandY>0.05){
  //     lHandY = prevLHandY - 0.05;
  //   } else if(prevLHandY-lHandY<-0.05){
  //     lHandY = prevLHandY + 0.05;
  //   }
  //   if(prevRHandY-rHandY>0.05){
  //     rHandY = prevRHandY - 0.05;
  //   } else if(prevRHandY-lHandY<-0.05){
  //     rHandY = prevRHandY + 0.05;
  //   }
  //   prevLHandY = lHandY;
  //   prevRHandY = rHandY;
  // }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
