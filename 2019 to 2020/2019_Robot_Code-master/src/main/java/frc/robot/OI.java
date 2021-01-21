/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

//import frc.robot.Commands.HatchSolenoidChange;

/**
 * Add your docs here.
 */
public class OI {

    ///These are the controllers used for controlling the robot
    public static XBoxController driver = new XBoxController(0);
    public static XBoxController operator = new XBoxController(1);
    
    public OI(){
        ///Driver function/button mapping

        ///Operator function button mapping
        //operator.a.whenPressed(new HatchSolenoidChange());

    }
}
