package com.bootcamp.patterns2.observer.forum;

public interface Observable {

    void registryObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
