package frc.robot.utils;

public class SwerveModuleConstants {
    public final int driveMotorID;
    public final int angleMotorID;
    public final int absoluteEncoderPWMPort;
    public final double absoluteEncoderOffsetDegree;

    public SwerveModuleConstants(int driveMotorID, int angleMotorID, int absoluteEncoderPWMPort, double absoluteEncoderOffsetDegree) {
        this.driveMotorID = driveMotorID;
        this.angleMotorID = angleMotorID;
        this.absoluteEncoderPWMPort = absoluteEncoderPWMPort;
        this.absoluteEncoderOffsetDegree = absoluteEncoderOffsetDegree;
    }
}
