// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.ejml.interfaces.decomposition.TridiagonalSimilarDecomposition_F32;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  /** Creates a new ShooterSubsystem. */

  private TalonFX m_ShooterMotorRight;
  private TalonFX m_ShooterMotorLeft;

  public ShooterSubsystem() {
    m_ShooterMotorLeft = new TalonFX(0);
    m_ShooterMotorRight = new TalonFX(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
