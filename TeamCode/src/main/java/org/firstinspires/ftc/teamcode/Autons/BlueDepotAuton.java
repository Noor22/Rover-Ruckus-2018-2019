package org.firstinspires.ftc.teamcode.Autons;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Subsystems.Robot;
import org.firstinspires.ftc.teamcode.Util.Gyro;

/**
 * Created by Sumanth on 11/3/18.
 */

public class BlueDepotAuton extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        Robot robot = new Robot();
        Gyro gyro = new Gyro();

        robot.initAuton(hardwareMap, this, gyro);

        String mineralLocation = "";

        while(!opModeIsActive()){

            mineralLocation = robot.detectionUtil.getMineralPos();

        }
        waitForStart();
        if(opModeIsActive()){



        }

    }
}
