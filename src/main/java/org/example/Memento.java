package org.example;

import java.util.List;

public interface Memento {
    void setBallState(List<Ball> ball);
    List<Ball> getBallState();

}
