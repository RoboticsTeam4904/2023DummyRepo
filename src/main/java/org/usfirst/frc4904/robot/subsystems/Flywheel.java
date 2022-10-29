// Copyright (c) FIRST and other WPILib contributors.
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.usfirst.frc4904.robot.subsystems;

import org.usfirst.frc4904.standard.custom.motioncontrollers.CANTalonFX;
import org.usfirst.frc4904.standard.custom.sensors.CANTalonEncoder;
import org.usfirst.frc4904.standard.subsystems.motor.Motor;
import org.usfirst.frc4904.standard.subsystems.motor.PositionSensorMotor;
import org.usfirst.frc4904.standard.subsystems.motor.VelocitySensorMotor;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Flywheel extends SubsystemBase {
    public double shoot_velocity;
    public CANTalonFX shooterEncoder;
    public Motor shooterMotor;

    public Flywheel(String name, Motor shootorMotor, CANTalonFX shooterEncoder, double shoot_velocity) {
        super();
        setName(name);
        this.shooterMotor = shootorMotor;
        this.shooterEncoder = shooterEncoder;
        this.shoot_velocity = shoot_velocity;
    }
    
}
