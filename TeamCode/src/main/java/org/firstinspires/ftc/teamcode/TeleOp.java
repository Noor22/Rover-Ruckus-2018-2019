package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.Subsystems.Robot;
import org.firstinspires.ftc.teamcode.Util.Gyro;

/**
 * Created by Sumanth on 10/2/18.
 */

public class TeleOp extends OpMode {

    DcMotor l1, l2, r1, r2;

    @Override
    public void init() {

        Robot robot = new Robot();
        Gyro gyro = new Gyro();
        gyro.initGyro(hardwareMap);
        robot.init(hardwareMap, gyro);
    }

    Robot robot = new Robot();
    Gyro gyro = new Gyro();

    @Override
    public void loop() {

        double leftVal = gamepad1.left_stick_y;
        double rightVal = gamepad1.right_stick_y;


        if(gamepad1.left_bumper && gamepad1.right_bumper){

            leftVal *= 0.3;
            rightVal *= -0.3;
        }

        robot.driveTrain.setLeftPower(leftVal);
        robot.driveTrain.setRightPower(rightVal);

    }

    @Override
    public void stop() {

        robot.driveTrain.setLeftPower(0);
        robot.driveTrain.setRightPower(0);
    }
}
