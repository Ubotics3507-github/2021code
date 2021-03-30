// Alex's attempt at drivetrain before he realized there already was one


// package frc.robot.Subsystems;

// //imports
// import edu.wpi.first.wpilibj.command.Subsystem;
// import com.ctre.phoenix.motorcontrol.can.TalonSRX;
// import com.ctre.phoenix.motorcontrol.ControlMode;
// import frc.robot.RobotMap;

// //stuff
// public class DriveTrain extends Subsystem {

//     TalonSRX leftMaster = new TalonSRX(RobotMap.leftMaster);
//     TalonSRX leftFollower = new TalonSRX(RobotMap.leftFollower);
//     TalonSRX leftFollower2 = new TalonSRX(RobotMap.leftFollower2);
//     TalonSRX rightMaster = new TalonSRX(RobotMap.rightMaster);
//     TalonSRX rightFollower = new TalonSRX(RobotMap.rightFollower);
//     TalonSRX rightFollower2 = new TalonSRX(RobotMap.rightFollower2);

//     @Override
//     public void initDefaultCommand() {
//       // Set the default command for a subsystem here.
//       // setDefaultCommand(new MySpecialCommand());
//     }

//     public void leftMotors(double speed){
//         leftMaster.set(ControlMode.PercentOutput, speed);
//         leftFollower.set(ControlMode.PercentOutput, speed);
//         leftFollower2.set(ControlMode.PercentOutput, speed);
//     }
//     public void rightMotors(double speed){
//         rightMaster.set(ControlMode.PercentOutput, speed);
//         rightFollower.set(ControlMode.PercentOutput, speed);
//         rightFollower2.set(ControlMode.PercentOutput, speed);
//     }

// }