package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;
import frc.robot.commands.*;


public class OI {
    private ControlPanel _controlPanel;

    CommandBase _runControlPanel;

    public OI (ControlPanel controlPanelSpinMotor){
        _controlPanel = controlPanelSpinMotor;
    }

    public void init() {
        Joystick driverControl = new Joystick(0);

        JoystickButton SpinControlPanelButton = new JoystickButton(driverControl, 3); // Button 8 = Start Button
    SpinControlPanelButton.whileHeld(new RunControlPanel(_controlPanel));
    }
}
