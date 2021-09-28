// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    // Motor Controller CAN IDs Start
    public static final int LEFT_FRONT_MOTOR_CHANNEL = 1; // SparkMax
    public static final int RIGHT_FRONT_MOTOR_CHANNEL = 2; // SparkMax
    public static final int LEFT_BACK_MOTOR_CHANNEL = 3; // SparkMax
    public static final int RIGHT_BACK_MOTOR_CHANNEL = 4; // SparkMax
    public static final int MOTOR = 5; // TalonSRX
    // Motor Controller CAN IDs End

    // PWM Motor Controller IDs Start
    public static final int PWM_MOTOR = 0; // Spark 
    // PWM Motor Controller IDs End


    /*=== All Controller Integer Values can be found in the Drive Station Inputs Tab ===*/
    // Driver XBox Controller Start
    public static final int DRIVER_JOYSTICK_ID = 0; // 1st controller input in DS is used for Driver. 
    public static final int DRIVER_XBOX_LEFT_X_AXIS = 0;
    public static final int DRIVER_XBOX_LEFT_Y_AXIS = 1;
    public static final int DRIVER_XBOX_RIGHT_X_AXIS = 2;
    public static final int DRIVER_XBOX_RIGHT_Y_AXIS = 3;
    public static final int DRIVER_XBOX_LEFT_TRIGGER = 0;
    public static final int DRIVER_XBOX_RIGHT_TRIGGER = 0;
    public static final int DRIVER_XBOX_A_BUTTON = 0; 
    public static final int DRIVER_XBOX_B_BUTTON = 0; 
    public static final int DRIVER_XBOX_X_BUTTON = 0; 
    public static final int DRIVER_XBOX_LEFT_BUMPER = 0; 
    public static final int DRIVER_XBOX_RIGHT_BUMPER = 0; 
    public static final int DRIVER_XBOX_BACK_BUTTON = 0; 
    public static final int DRIVER_XBOX_START_BUTTON = 0; 
    public static final int DRIVER_XBOX_GUIDE_BUTTON = 0; // ??? Does this button work in the drive station. 
    // Driver XBox Controller End
    // Manipulator XBox Controller Start
    public static final int MANIPULATOR_JOYSTICK_ID = 1; // 2nd controller input in DS is used for Manupulator. 
    public static final int MANIPULATOR_XBOX_LEFT_X_AXIS = 0;
    public static final int MANIPULATOR_XBOX_LEFT_Y_AXIS = 1;
    public static final int MANIPULATOR_XBOX_RIGHT_X_AXIS = 2;
    public static final int MANIPULATOR_XBOX_RIGHT_Y_AXIS = 3;
    public static final int MANIPULATOR_XBOX_LEFT_TRIGGER = 0;
    public static final int MANIPULATOR_XBOX_RIGHT_TRIGGER = 0;
    public static final int MANIPULATOR_XBOX_A_BUTTON = 0; 
    public static final int MANIPULATOR_XBOX_B_BUTTON = 0; 
    public static final int MANIPULATOR_XBOX_X_BUTTON = 0; 
    public static final int MANIPULATOR_XBOX_LEFT_BUMPER = 0; 
    public static final int MANIPULATOR_XBOX_RIGHT_BUMPER = 0; 
    public static final int MANIPULATOR_XBOX_BACK_BUTTON = 0; 
    public static final int MANIPULATOR_XBOX_START_BUTTON = 0; 
    public static final int MANIPULATOR_XBOX_GUIDE_BUTTON = 0; // ??? Does this button work in the drive station. 
    // Manipulator XBox Controller End
    
    public static final double DRIVE_TRAIN_SPEED = 1; // This can be adjusted for demo driving as an example. 

}
