/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
// import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
// import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import frc.robot.Commands.AutoDriveTime;
import frc.robot.Subsytems.CargoIntake;
import frc.robot.Subsytems.DriveBase;
//import frc.robot.Subsytems.HatchIntake;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  
   ///These are variables that require constant updates and apply to the whole robot
   public static double volts;

   ///This is the necessarry compressor for the robot
   Compressor compressor = new Compressor(0);

   ///These are the basic initializations of the subsystems
   public static DriveBase driveBase = new DriveBase();
   //public static HatchIntake hatchIntake = new HatchIntake();
   public static CargoIntake cargoIntake = new CargoIntake();

   ///This initializes the OI
   OI oi = new OI();

   ///This is for the different sendable choosers
  // public static SendableChooser driveTypeChooser;
  // public static SendableChooser decelerator;
  // public static SendableChooser autonomousChooser;

  @Override
  public void robotInit() {
    // driveTypeChooser = new SendableChooser<String>();
    // driveTypeChooser.addDefault("Tank Drive","Tank");
    // driveTypeChooser.addObject("Arcade Drive", "Arcade");
    // driveTypeChooser.addObject("Arcade Split Drive", "Arcade Split");
    // SmartDashboard.putData("driveType", driveTypeChooser);
    // autonomousChooser = new SendableChooser<>();
    // autonomousChooser.addDefault("None", null);
    // autonomousChooser.addObject("SlowFor2",new AutoDriveTime(2, 0.1, 0.1));
    // SmartDashboard.putData("autonomous", autonomousChooser);
    // decelerator = new SendableChooser<Boolean>();
    // decelerator.addDefault("ON",true);
    // decelerator.addObject("Off", false);
    // SmartDashboard.putData(decelerator);

  }

  @Override
  public void autonomousInit() {
    // if(autonomousChooser!=null){
    //   Command autoProgram = (Command) autonomousChooser.getSelected();
    //   autoProgram.start();
    // }
  }

  @Override
  public void autonomousPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
    Scheduler.getInstance().run();
  }

}
