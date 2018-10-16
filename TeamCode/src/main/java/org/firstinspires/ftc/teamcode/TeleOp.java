package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Sumanth on 10/2/18.
 */

public class TeleOp extends OpMode {

    DcMotor l1, l2, r1, r2;

    @Override
    public void init() {

        l1.setDirection(DcMotorSimple.Direction.FORWARD);
        l2.setDirection(DcMotorSimple.Direction.FORWARD);
        r1.setDirection(DcMotorSimple.Direction.FORWARD);
        r2.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    @Override
    public void loop() {

        double leftVal = gamepad1.left_stick_y;
        double rightVal = gamepad1.right_stick_y;


        if(gamepad1.left_bumper && gamepad1.right_bumper){

            leftVal *= 0.3;
            rightVal *= -0.3;
        }

        l1.setPower(leftVal);
        l2.setPower(leftVal);
        r1.setPower(rightVal);
        r2.setPower(rightVal);




    }

    @Override
    public void stop() {

        l1.setPower(0);
        l2.setPower(0);
        r1.setPower(0);
        r2.setPower(0);
    }
}
