package org.example;

public interface  Originator {
    Memento save();
    void restore(Memento memento);
}
