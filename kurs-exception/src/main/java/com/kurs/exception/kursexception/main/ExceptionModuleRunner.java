package com.kurs.exception.kursexception.main;

import com.kurs.exception.kursexception.io.FileReader;
import com.kurs.exception.kursexception.io.FileReaderException;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile("names.txt");
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
