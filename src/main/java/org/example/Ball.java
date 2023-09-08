package org.example;

import javafx.scene.paint.Paint;

import java.time.Duration;
import java.util.Random;

public class Ball implements BallThink{
    private double xPos;
    private double yPos;
    private double radius;
    private double xVel;
    private double yVel;
    private Paint colour;
    private boolean collide;

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
    void setCollide(boolean bool) {this.collide = bool;}
    boolean getCollide() {return this.collide;}

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

    public void think(long currentTick) {
        boolean freeze = false;
        long saveTick = 0;
        if (currentTick - saveTick == 60)
            BallThink.accelerate(this);
        // Here is where the strategy should have some effect.
        // You can add parameters to the think method so the ball knows something about its
        // world to make decisions with, or you can inject things upon construction for it to query
        if (this.colour.equals(Paint.valueOf("BLACK"))){


        }else if(this.colour.equals(Paint.valueOf("PURPLE"))){
            if(this.getCollide()){
                PurpleBallThink.freeze(this);
            }

        }else if(this.colour.equals(Paint.valueOf("ORANGE"))){

            OrangeBallThink.accelerate(this);
        }
        else{
            return;
        }
        saveTick = currentTick;
    }
}
