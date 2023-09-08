package org.example;

import javafx.animation.PauseTransition;
import javafx.scene.paint.Paint;
import javafx.util.Duration;

public interface PurpleBallThink extends BallThink{

    static void freeze(Ball ball){
        double xVel = ball.getxVel();
        double yVel = ball.getyVel();
        if(ball.getCollide()) {
            ball.setyVel(0);
            ball.setxVel(0);
            PauseTransition pauseTransition = new PauseTransition(Duration.seconds(1.2));
            pauseTransition.setOnFinished(event -> {
                ball.setxVel(xVel * 1.7);
                ball.setyVel(yVel * 1.7);
                ball.setCollide(false);
            });
    }
}
}
