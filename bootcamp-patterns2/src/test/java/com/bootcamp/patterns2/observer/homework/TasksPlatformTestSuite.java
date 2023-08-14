package com.bootcamp.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksPlatformTestSuite {

    @Test
    void testUpdate() {
        //given
        TasksPlatform practicalExcercises = new PlatformPractic();
        TasksPlatform theoryExcercises = new PlatformTheory();
        Mentor mentor1 = new Mentor("Adam");
        Mentor mentor2 = new Mentor("Piotr");
        Mentor mentor3 = new Mentor("Leszek");
        practicalExcercises.registry(mentor1);
        practicalExcercises.registry(mentor2);
        theoryExcercises.registry(mentor3);

        //when
        practicalExcercises.addPost("Hi, everyone");
        practicalExcercises.addPost("Hi, everyone and you!");
        theoryExcercises.addPost("new theory");

        //then
        assertEquals(2,practicalExcercises.getMessages().size());
        assertEquals(1,theoryExcercises.getMessages().size());
    }
}
