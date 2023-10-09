public class BallObserver implements Observer{
    double x;
    double y;
    double xVel;
    double yVel;
    @Override
    public void updateX(double newX) {
        this.x= newX;
    }

    @Override
    public void updateY(double newY) {
        this.y = newY;
    }

    @Override
    public void updateXvel(double newXvel) {
        this.xVel = newXvel;
    }

    @Override
    public void updateYvel(double newYvel) {
        this.yVel = newYvel;
    }

    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double getxVel(){return this.xVel;}
    public double getyVel(){return this.yVel;}
}
