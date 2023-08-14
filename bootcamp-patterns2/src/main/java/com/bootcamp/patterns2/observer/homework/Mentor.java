package com.bootcamp.patterns2.observer.homework;

public class Mentor implements Observer {

    private String name;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksPlatform tasksPlatform) {
        System.out.println("New message in platform " + tasksPlatform.getName());
    }

    public String name() {
        return name;
    }
}
