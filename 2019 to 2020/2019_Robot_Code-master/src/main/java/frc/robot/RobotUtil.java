/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class RobotUtil {

    ///These are the basic robot variables
    public static double robotMass = 0;
    public static double wheelCircumference = 0;

    ///This returns zero if the magnitude of input is less than  the magnitude of deadzone
    public static double deadZone(double input, double deadzone){
        if(input>deadzone||input<-deadzone){
            return input;
        }
        else{
            return 0;
        }
    }

    ///This logarithmizes a number based on a maximum (assuming k val of 1 and b val of 1)
    ///Also assumes input of zero yields zero
    public static double capper(double input, double max){
        return (max/(1+Math.pow(Math.E, input)))-(max/2);
    }
}
