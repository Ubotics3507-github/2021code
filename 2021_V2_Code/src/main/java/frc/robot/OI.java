/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

//import frc.robot.Commands.HatchSolenoidChange;

/**
 * Add your docs here.
 */
public class OI {
    ///These are the controllers used for controlling the robot
    public final XBoxController driver = new XBoxController(0);
    public final XBoxController operator = new XBoxController(1);
    //buttons
    Button dButtonA = new JoystickButton(this.driver, RobotMap.BUTTON_A);
	Button dButtonB = new JoystickButton(this.driver, RobotMap.BUTTON_B);
	Button dButtonX = new JoystickButton(this.driver, RobotMap.BUTTON_X);
	Button dButtonY = new JoystickButton(this.driver, RobotMap.BUTTON_Y);
	Button dButtonBack = new JoystickButton(this.driver, RobotMap.BACK_BUTTON);
	Button dButtonStart = new JoystickButton(this.driver, RobotMap.START_BUTTON);
	
	Button oButtonA = new JoystickButton(this.operator, RobotMap.BUTTON_A);
	Button oButtonB = new JoystickButton(this.operator, RobotMap.BUTTON_B);
	Button oButtonY = new JoystickButton(this.operator, RobotMap.BUTTON_Y);
	Button oButtonX = new JoystickButton(this.operator, RobotMap.BUTTON_X);
	Button oButtonBack = new JoystickButton(this.operator, RobotMap.BACK_BUTTON);
	Button oButtonStart = new JoystickButton(this.operator, RobotMap.START_BUTTON);
  	Button oButtonRightStick = new JoystickButton(this.operator, RobotMap.RIGHT_STICK_BUTTON);
	Button oButtonRightBumper = new JoystickButton(this.operator, RobotMap.RIGHT_BUMPER);
	Button oButtonLeftBumper = new JoystickButton(this.operator, RobotMap.LEFT_BUMPER);
    
    public double driverRawAxis(int axis){
       return driver.getRawAxis(axis);
    }

	
    public OI(){
        ///Driver function/button mapping

        ///Operator function/button mapping

    }
}
