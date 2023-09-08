package org.example;

import javafx.geometry.Point2D;

public interface BallThink {
    static void accelerate(Ball ball){
        if(ball.getyVel() > 0)
            ball.setyVel(ball.getyVel() + 1);
        else
            ball.setyVel(ball.getyVel() - 1);
        if(ball.getxVel() > 0)
            ball.setxVel(ball.getxVel() + 1);
        else
            ball.setxVel(ball.getxVel() - 1);
    }

}


