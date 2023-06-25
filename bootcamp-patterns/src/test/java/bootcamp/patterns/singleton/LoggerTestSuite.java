package bootcamp.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testLastLog() {
        //given
        logger = Logger.INSTANCE;
        logger.log("test1");
        //when & then
        assertEquals("test1", logger.getLastLog());
    }
}
