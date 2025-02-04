package org.firstinspires.ftc.teamcode.Hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


public class Intake {

    public DcMotor leftIntake;
    public DcMotor rightIntake;

    public final double SUCK_SPEED = 0.35;
    public enum Directions {REST, SUCK, BLOW}


    public Servo stoneYanker;
    public final double UNYANKED_POS = 0.33;
    public final double YANKED_POS = 0.51;



    public void initHardware(HardwareMap aHwMap) {

        leftIntake = aHwMap.get(DcMotor.class, "leftIntake");
        rightIntake = aHwMap.get(DcMotor.class, "rightIntake");
        rightIntake.setDirection(DcMotor.Direction.REVERSE);

        stoneYanker = aHwMap.get(Servo.class, "stoneYanker");
    }


    public void setSpeed(double speed) {

        leftIntake.setPower(speed);
        rightIntake.setPower(speed);
    }


    // Set intake speed to suck in skystone
    public void suck() {

        leftIntake.setPower(-SUCK_SPEED);
        rightIntake.setPower(-SUCK_SPEED);
    }


    // Set intake speed to adjust in skystone
    public void blow() {

        leftIntake.setPower(SUCK_SPEED);
        rightIntake.setPower(SUCK_SPEED);
    }


    public void rest() {

        leftIntake.setPower(0);
        rightIntake.setPower(0);
    }



    public Directions getDirection() {

        Directions currentDirection;
        double intakeAvg = (rightIntake.getPower()+leftIntake.getPower())/2;

        if (intakeAvg < 0) {
            currentDirection = Directions.SUCK;

        } else if (intakeAvg > 0) {
            currentDirection = Directions.BLOW;

        } else {
            currentDirection = Directions.REST;
        }

        return currentDirection;
    }



    public void yankStone() {
        stoneYanker.setPosition(YANKED_POS);
    }


    public void unYankStone() {
        stoneYanker.setPosition(UNYANKED_POS);
    }


}
