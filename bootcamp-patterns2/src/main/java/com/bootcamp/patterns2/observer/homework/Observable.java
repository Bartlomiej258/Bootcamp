package com.bootcamp.patterns2.observer.homework;


public interface Observable {

    void registry(Observer observer);

    void notifyObservers();

    void remove(Observer observer);
}
