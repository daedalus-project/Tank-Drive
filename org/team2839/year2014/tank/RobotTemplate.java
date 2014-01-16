/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.team2839.year2014.tank;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
/*
 * 
 * @author Matt
 * @author Caleb
 */

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    private Joystick joystickLeft = new Joystick(Constants.kJoystickLeft);
    private Joystick joystickRight = new Joystick(Constants.kJoystickRight);
    // The number slots might change depending on where the motors are
    private Gearbox gearboxRight = new Gearbox(Constants.kMotorsRight);
    private Gearbox gearboxLeft = new Gearbox(Constants.kMotorsLeft);
    
    private double speedRight;
    private double speedLeft;
 
    public void robotInit() {
        speedRight = 0;
        speedLeft = 0;
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        speedRight = joystickRight.getY();
        speedLeft = joystickLeft.getY();
        gearboxRight.set(speedRight * Constants.kRightMultiplier);
        gearboxLeft.set(speedLeft * Constants.kLeftMultiplier);
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
