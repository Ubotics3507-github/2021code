package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;

public class Auto extends CommandGroup {
    ///track 1
    //turn
    addSequential(new AutoDriveTime(2,.5,-.5));
    //
    addSequential(new AutoDriveTime(0,0,0));
    //
    addSequential(new AutoDriveTime(0,0,0));
    //
    addSequential(new AutoDriveTime(0,0,0));
    //
    addSequential(new AutoDriveTime(0,0,0));
    //
    addSequential(new AutoDriveTime(0,0,0));
}