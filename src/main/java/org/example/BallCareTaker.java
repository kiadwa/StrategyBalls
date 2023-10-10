package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class BallCareTaker {
    private Queue<Memento> ballMementosQ = new LinkedList<>();

    public void addMemento(BallMemento ballMemento){
        ballMementosQ.add(ballMemento);
    }
    public Memento getMemento(){
        return ballMementosQ.remove();
    }
    public Queue<Memento> getBallMementosQ(){
        return ballMementosQ;
    }
}
