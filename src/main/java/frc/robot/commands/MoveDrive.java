// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class MoveDrive extends CommandBase {
  /** Creates a new MoveDrive. */

  public MoveDrive(DriveTrain driveTrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    double move = -RobotContainer.controller.getRawAxis(1);
    double turn = RobotContainer.controller.getRawAxis(0);
   
    frc.robot.subsystems.DriveTrain.manualDrive(move, turn);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
