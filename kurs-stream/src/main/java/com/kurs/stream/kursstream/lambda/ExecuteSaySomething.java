package com.kurs.stream.kursstream.lambda;

public class ExecuteSaySomething implements Executor {
    @Override
    public void process() {
        System.out.println("This is an example text");
    }
}
