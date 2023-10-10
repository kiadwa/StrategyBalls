package org.example;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

public interface BlueBallThink extends BallThink{

    static void freeze(Ball ball){
        double xVel = ball.getxVel();
        double yVel = ball.getyVel();
        if(ball.getCollide()) {
            ball.setyVel(0);
            ball.setxVel(0);
            PauseTransition pauseTransition = new PauseTransition(Duration.seconds(1.3));
            pauseTransition.setOnFinished(event -> {
                ball.setxVel(xVel);
                ball.setyVel(yVel);

            });
    }
        ball.setCollide(false);
}
}
