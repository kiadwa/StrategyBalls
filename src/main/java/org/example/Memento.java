package org.example;

import java.util.HashMap;
import java.util.List;

public interface Memento {
    void setBallState(List<HashMap<String, Double>> ballState);
   List<HashMap<String,Double>> getBallState();

}
