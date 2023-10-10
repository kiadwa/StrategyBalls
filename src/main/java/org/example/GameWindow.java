package org.example;

import java.util.Iterator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.util.Duration;

class GameWindow {
    private final GraphicsContext gc;
    private Scene scene;
    private BallPit model;

    GameWindow(BallPit model) {
        this.model = model;

        Pane pane = new Pane();
        this.scene = new Scene(pane, model.getWidth(), model.getHeight());
        Canvas canvas = new Canvas(model.getWidth(), model.getHeight());
        gc = canvas.getGraphicsContext2D();
        pane.getChildren().add(canvas);
    }

    Scene getScene() {
        return this.scene;
    }

    void run() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(17),
                t -> this.draw()));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
    private void printBallData(){
        gc.setFill(Paint.valueOf("black"));

        gc.fillText("RED---" +
                "xPos: "+ (int) model.getBallObservers().get(0).getObsX() +
                " yPos: " + (int) model.getBallObservers().get(0).getObsY() +
                " xVel: "+ (int) model.getBallObservers().get(0).getObsXvel()  +
                " yVel: "+ (int) model.getBallObservers().get(0).getObsYvel() , 10, 350);
        gc.fillText("BLACK---" +
                "xPos: "+ (int) model.getBallObservers().get(1).getObsX() +
                " yPos: " + (int) model.getBallObservers().get(1).getObsY() +
                " xVel: "+ (int) model.getBallObservers().get(1).getObsXvel()  +
                " yVel: "+ (int) model.getBallObservers().get(1).getObsYvel() , 10, 370);
        gc.fillText("BLUE--" +
                "xPos: "+ (int) model.getBallObservers().get(2).getObsX() +
                " yPos: " + (int) model.getBallObservers().get(2).getObsY() +
                " xVel: "+ (int) model.getBallObservers().get(2).getObsXvel()  +
                " yVel: "+ (int) model.getBallObservers().get(2).getObsYvel() , 10, 390);
    }

    private void draw() {
        model.tick();

        gc.clearRect(0, 0, model.getWidth(), model.getHeight());

        for (Ball ball: model.getBalls()) {
            gc.setFill(ball.getColour());
            gc.fillOval(ball.getxPos() - ball.getRadius(),
                    ball.getyPos() - ball.getRadius(),
                    ball.getRadius() * 2,
                    ball.getRadius() * 2);
            printBallData();
        }
    }
}
