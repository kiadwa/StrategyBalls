import javafx.scene.paint.Paint;

import java.util.Random;

public class Ball implements Subject{
    private double xPos;
    private double yPos;
    private double radius;
    private double xVel;
    private double yVel;
    private Paint colour;

    private Observer observer;

    Ball(double startX, double startY, double startRadius, Paint colour) {
        this.xPos = startX;
        this.yPos = startY;
        this.radius = startRadius;
        this.colour = colour;
        xVel = new Random().nextInt(5);
        yVel = new Random().nextInt(5);
    }

    void tick() {
        xPos += xVel;
        yPos += yVel;
    }

    void setxVel(double xVel) {
        this.xVel = xVel;
    }

    void setyVel(double yVel) {
        this.yVel = yVel;
    }

    double getRadius() {
        return radius;
    }

    double getxPos() {
        return xPos;
    }

    double getyPos() {
        return yPos;
    }

    Paint getColour() {
        return colour;
    }

    double getxVel() {
        return xVel;
    }

    double getyVel() {
        return yVel;
    }

    void setxPos(double xPos) {
        this.xPos = xPos;
    }

    void setyPos(double yPos) {
        this.yPos = yPos;
    }
    @Override
    public void addObserver(Observer obs){
        this.observer = obs;
    }

    @Override
    public void removeObserver(Observer obs) {
        this.observer = null;
    }

    @Override
    public void notifyObserver() {
        observer.updateX(this.xPos);
        observer.updateY(this.yPos);
        observer.updateXvel(this.xVel);
        observer.updateYvel(this.yVel);
    }

    void think() {
        // Here is where the strategy should have some effect.
        // You can add parameters to the think method so the ball knows something about its
        // world to make decisions with, or you can inject things upon construction for it to query
       notifyObserver();
    }
}
