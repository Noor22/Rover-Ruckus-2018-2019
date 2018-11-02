package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Util.Gyro;
import org.firstinspires.ftc.teamcode.Util.MineralDetectionUtil;

public class Robot
{
    public DriveTrain driveTrain;
    public MineralDetectionUtil detectionUtil;

    public void initTeleOp(HardwareMap hardwareMap, Gyro gyrofromOpMode)
    {
        driveTrain = new DriveTrain(hardwareMap);
        driveTrain.setGyro(gyrofromOpMode);

    }

    public void initAuton(HardwareMap hardwareMap, LinearOpMode linearOpMode, Gyro gyrofromOpMode)
    {
        driveTrain = new DriveTrain(hardwareMap,linearOpMode);
        driveTrain.setGyro(gyrofromOpMode);

        detectionUtil = new MineralDetectionUtil(linearOpMode, hardwareMap);
        detectionUtil.init();
    }


}
