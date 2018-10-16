package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Sumanth on 10/2/18.
 */

public class Intake implements SubsystemTemplate {

    private CRServo intake;

    public Intake(HardwareMap hardwareMap){

        intake = hardwareMap.crservo.get("intake");

        intake.setDirection(DcMotorSimple.Direction.FORWARD);

    }

    public enum Mode
    {
        ENCODERS,
        SPEED,
        STOP_RESET,
        NOTHING
    }

    public void setMode(Mode d) {
        DcMotor.RunMode runMode = null;

        switch (d) {
            case ENCODERS:
                runMode = DcMotor.RunMode.RUN_TO_POSITION;
                break;
            case SPEED:
                runMode = DcMotor.RunMode.RUN_USING_ENCODER;
                break;
            case STOP_RESET:
                runMode = DcMotor.RunMode.STOP_AND_RESET_ENCODER;
                break;
            case NOTHING:
                runMode = DcMotor.RunMode.RUN_WITHOUT_ENCODER;
                break;

        }

    }

    public void intake(){

        setPower(1);

    }

    public void outtake(){

        setPower(-1);

    }

    public void stop(){

        setPower(0);

    }

    public void setPower(double pwr){

        intake.setPower(pwr);

    }

    @Override
    public String display() {
        return null;
    }
}
