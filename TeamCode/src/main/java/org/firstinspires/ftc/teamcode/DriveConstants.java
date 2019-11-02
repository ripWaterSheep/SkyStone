package org.firstinspires.ftc.teamcode;


public class DriveConstants {
    
    /**
     *
     * All the robot's constants relating to its motion and measurements
     * Every linear measurement uses inches.
     * 
     */
    
    
    public static final double WHEEL_RADIUS = 2;
    public static final double WHEEL_CIRCUMFERENCE = WHEEL_RADIUS*2*Math.PI;
    
    // length between front & back wheels
    public static final double WHEEL_BASE = 10;
    
    // width between left and right wheels
    public static final double TRACK_WIDTH = 16;
    
    
    /*
     * CIRCUMCIRCLE: Circle circumscribed about points of a polygon.
     *
     * CIRCUMDIAMETER: Diameter of the circumcircle of the robot, really the distance between ground contact points
     * of 2 diagonal wheels (hypotenuse of wheelbase and track width)
     * 
     */
    
    public static final double CIRCUMDIAMETER = Math.hypot(WHEEL_BASE, TRACK_WIDTH);
    public static final double CIRCUMCIRCLE_CIRCUMFERENCE = CIRCUMDIAMETER*Math.PI;

    // How far to the side the camera is placed (left is negative)
    public static final double WEBCAM_OFFSET = -3;
    
    // How far off from the center of the robot each encoder is located
    public static final double Y_ENCODER_OFFSET_X = 0;
    public static final double Y_ENCODER_OFFSET_Y = 0;
    public static final double X_ENCODER_OFFSET_X = 0;
    public static final double X_ENCODER_OFFSET_Y = 0;
    
    
}