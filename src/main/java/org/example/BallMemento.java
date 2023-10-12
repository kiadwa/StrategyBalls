package org.example;

import java.util.HashMap;
import java.util.List;

public class BallMemento implements Memento {
    private List<HashMap<String,Double>> ballMementos;

    @Override
    public void setBallState(List<HashMap<String, Double>> ballMementos) {
        this.ballMementos = ballMementos;
    }

    @Override
    public List<HashMap<String, Double>> getBallState() {
        return ballMementos;
    }
}
