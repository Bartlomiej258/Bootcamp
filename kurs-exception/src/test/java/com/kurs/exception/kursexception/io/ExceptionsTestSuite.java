package com.kurs.exception.kursexception.io;

import com.kurs.exception.kursexception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTestSuite {

    @Test
    void testShouldThrowsException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        Assertions.assertAll(
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0, 3)),
                () -> Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(2,4))
        );
    }
}
