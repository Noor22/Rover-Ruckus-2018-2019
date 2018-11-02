package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Subsystems.Robot;
import org.firstinspires.ftc.teamcode.Util.Gyro;

/**
 * Created by Sumanth on 10/29/18.
 */

public class ArcadeTeleOp extends OpMode {

    Robot robot = new Robot();
    Gyro gyro = new Gyro();

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        float yval = gamepad1.left_stick_y;
        float xval = gamepad1.right_stick_x;


        float lpwr = (float) Math.pow(((yval - xval)), 3);
        float rpwr = (float) Math.pow((yval + xval), 3);

        robot.driveTrain.setLeftPower(lpwr);
        robot.driveTrain.setRightPower(rpwr);


    }

    @Override
    public void stop() {

        robot.driveTrain.setLeftPower(0);
        robot.driveTrain.setRightPower(0);

    }


}
