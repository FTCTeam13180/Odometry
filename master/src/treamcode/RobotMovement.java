package treamcode;

import static RobotUtilities.MovementVars.movement_x;
import static RobotUtilities.MovementVars.movement_y;


import static com.company.Robot.*;
import static treamcode.MathFunctions.AngleWrap;

public class RobotMovement {

    /**
     *
     * @param x
     * @param y
     * @param movementSpeed
     */

    public static void goToPosition(double x,  double y, double movementSpeed)  {

        double distanceToTarget = Math.hypot(x - worldXPosition, y - worldYPosition);

        double absoluteAngleToTarget = Math.atan2(y - worldYPosition, x - worldXPosition);

        double relativeAngleToPoint = AngleWrap (absoluteAngleToTarget - (worldAngle_rad - Math.toRadians(90)));



        double relativeXToPoint = Math.cos(relativeAngleToPoint) * distanceToTarget;
        double relativeYToPoint = Math.sin(relativeAngleToPoint) * distanceToTarget;

        double movementXPower = relativeXToPoint / (Math.abs(relativeXToPoint) + Math.abs(relativeYToPoint));
        double movementYPower = relativeYToPoint / (Math.abs(relativeXToPoint) + Math.abs(relativeYToPoint));


         movement_x = movementXPower;
         movement_y = movementYPower;



    }
}
