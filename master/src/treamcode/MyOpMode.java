package treamcode;

import RobotUtilities.MovementVars;
//import Solution.CurvePoint;
import Solution.MovementEssentials;

import java.util.ArrayList;

public class MyOpMode extends OpMode{

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        RobotMovement.goToPosition(358/2, 358/2, 0.3);
    }
}
