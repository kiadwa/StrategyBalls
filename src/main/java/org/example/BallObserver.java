package org.example;

public class BallObserver implements Observer{
    private double obsX;
    private double obsY;
    private double obsXvel;
    private double obsYvel;
    private Ball cSubject;
    public BallObserver(Ball cSubject){
        this.cSubject = cSubject;
    }
    @Override
    public void update() {
        this.obsX = cSubject.getxPos();
        this.obsY = cSubject.getyPos();
        this.obsXvel = cSubject.getxVel();
        this.obsYvel = cSubject.getyVel();
    }
    public double getObsX(){
        return this.obsX;
    }
    public double getObsY(){
        return this.obsY;
    }
    public double getObsXvel(){
        return this.obsXvel;
    }
    public double getObsYvel(){
        return this.obsYvel;
    }
}
