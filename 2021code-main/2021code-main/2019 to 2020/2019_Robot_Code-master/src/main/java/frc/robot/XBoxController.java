package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XBoxController extends XboxController{
	
	public Button a, b, x, y, lBump, rBump, back, start, lStick, rStick;
	public XBoxController(int port) {
		super(port);
		
		a = new JoystickButton(this, 1);
		b = new JoystickButton(this, 2);
		x = new JoystickButton(this, 3);
		y = new JoystickButton(this, 4);
		lBump = new JoystickButton(this, 5);
		rBump = new JoystickButton(this, 6);
		back = new JoystickButton(this, 7);
		start = new JoystickButton(this, 8);
		lStick = new JoystickButton(this, 9);
		rStick = new JoystickButton(this, 10);
	}

}