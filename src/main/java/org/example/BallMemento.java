package org.example;

import java.util.List;

public class BallMemento implements Memento {
    private List<Ball> ballMementos;

    @Override
    public void setBallState(List<Ball> ball) {
        this.ballMementos = ball;
    }

    @Override
    public List<Ball> getBallState() {
        return ballMementos;
    }
}
