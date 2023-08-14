package com.bootcamp.patterns2.observer.homework;

import java.util.LinkedList;
import java.util.List;

public class TasksPlatform implements Observable {

    private final List<Observer> observers;
    private final List<String> messages;
    private final String name;

    public TasksPlatform(String name) {
        this.observers = new LinkedList<>();
        this.messages = new LinkedList<>();
        this.name = name;
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObservers();
    }

    @Override
    public void registry(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
