/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
import frc.robot.RobotUtil;

public class AutoDriveTime extends Command {

  ///These are the necessary variables for AutoDriveTime
  double seconds;
  double secondsDeadZone;
  double leftSpeed;
  double rightSpeed;
  long time;
  long endTime;

  ///These variables are useful data points for configuring AutoDriveStraight
  double sumOfVolts;
  double startTime;
  double fullRunTime;
  public double voltsPerSecond;

  public AutoDriveTime(double seconds, double leftSpeed, double rightSpeed) {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.driveBase);
    this.seconds = seconds;
    this.leftSpeed = leftSpeed;
    this.rightSpeed = rightSpeed;
    this.time = System.currentTimeMillis();
    this.startTime = this.time;
    this.endTime = this.time += (this.seconds*1000);
    this.sumOfVolts = 0;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.driveBase.percentOutput(leftSpeed, rightSpeed);
    this.sumOfVolts += Robot.volts;
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return (RobotUtil.deadZone(System.currentTimeMillis(), this.secondsDeadZone)==0);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveBase.stop();
    this.fullRunTime = System.currentTimeMillis() - this.startTime;
    SmartDashboard.putNumber("VoltsPerSecond", this.sumOfVolts/(this.fullRunTime/1000));
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.driveBase.stop();
  }
}
