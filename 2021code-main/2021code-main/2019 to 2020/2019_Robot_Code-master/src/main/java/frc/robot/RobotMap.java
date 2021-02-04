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
public class RobotMap {

    ///Remote values
    public static final int DRIVER_CONTROLLER = 0;
	public static final int OPERATOR_CONTROLLER = 1;

	public static final int BUTTON_A = 1;
	public static final int BUTTON_B = 2;
	public static final int BUTTON_X = 3;
	public static final int BUTTON_Y = 4;
	public static final int LEFT_BUMPER = 5;
	public static final int RIGHT_BUMPER = 6;
	public static final int BACK_BUTTON = 7;
	public static final int START_BUTTON = 8;
	public static final int LEFT_STICK_BUTTON = 9;
    public static final int RIGHT_STICK_BUTTON = 10;
  
    public static final int DPAD_UP = 0;
    public static final int DPAD_RIGHT = 90;
    public static final int DPAD_DOWN = 180;
    public static final int DPAD_LEFT = 270;
	
	public static final int LEFT_STICK_X = 0;
	public static final int LEFT_STICK_Y = 1;
	public static final int RIGHT_STICK_Y = 5;
	public static final int RIGHT_STICK_X = 4;
	
	public static final int LEFT_TRIGGER = 2;
    public static final int RIGHT_TRIGGER = 3;
    //end of values

    ///These are the driveBase motor ID's
    public static int leftMaster = 4;
    public static int leftFollower = 5;
    public static int leftFollower2 = 6;
    public static int rightMaster = 1;
    public static int rightFollower = 2;
    public static int rightFollower2 = 3;

    //driver limitations and values
    public static final double TURNING_RATE = 0.7;

    ///These are the pneumatics for the lifter system

    // public static int leftBackSolenoid1 = 4;
    // public static int leftBackSolenoid2 = 6;
    // public static int rightBackSolenoid1 = 3;
    // public static int rightBackSolenoid2 = 5;

    ///These are the motors for the cargo intake
    public static int cargoMotor = 10;
    public static int cargoMotor2 = 11;
}
