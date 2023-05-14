package com.kurs.exception.kursexception.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {
        //given
        FileReader fileReader = new FileReader();
        //when & then
        Assertions.assertDoesNotThrow(()-> fileReader.readFile());
    }

    @Test
    void whenFileDoesntExistsReadFileShouldThrowException() {
        //given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        //when & then
        Assertions.assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    void testReadFileWithName() {
        //given
        FileReader fileReader = new FileReader();
        //when & then
        Assertions.assertAll(
                () -> Assertions.assertThrows(FileReaderException.class, () -> fileReader.readFile("niema.txt")),
                () -> Assertions.assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> Assertions.assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}
