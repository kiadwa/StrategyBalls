package org.example;
import org.example.BallPit;
public interface OrangeBallThink extends BallThink{
    static void accelerate(Ball ball){

        double ballxPos = ball.getxPos();
        double ballyPos = ball.getyPos();
        double radius = ball.getRadius();

        // Calculate distances to each edge
        double distanceToTop = ballyPos - radius;
        double distanceToBottom = 400 - (ballyPos + radius);  // Assuming the height of the space is 400
        double distanceToLeft = ballxPos - radius;
        double distanceToRight = 640 - (ballxPos + radius);  // Assuming the width of the space is 640

        // Find the closest edge
        double minDistance = Math.min(Math.min(distanceToTop, distanceToBottom), Math.min(distanceToLeft, distanceToRight));

        // Apply acceleration based on the closest edge
        if (minDistance == distanceToTop) {
            ball.setyVel(ball.getyVel() - 0.017);  // Accelerate upwards
        } else if (minDistance == distanceToBottom) {
            ball.setyVel(ball.getyVel() + 0.017);  // Accelerate downwards
        } else if (minDistance == distanceToLeft) {
            ball.setxVel(ball.getxVel() - 0.017);  // Accelerate to the left
        } else if (minDistance == distanceToRight) {
            ball.setxVel(ball.getxVel() + 0.017);  // Accelerate to the right
        }
        }
    }

