package com.kurs.stream.kursstream;

import com.kurs.stream.kursstream.beautifier.PoemBeautifier;
import com.kurs.stream.kursstream.iterate.NumberGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KursStreamApplication {

    public static void main(String[] args) {

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumberGenerator.generateEven(20);




    }
}
