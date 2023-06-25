package bootcamp.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SettingsFileEngineTestSuite {

    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile() {
        settingsFileEngine = SettingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
    }

    @AfterAll
    private static void closeSettingsFile() {
        settingsFileEngine.close();
    }

    @Test
    void testGetFileName() {
        //given
        //when
        boolean result = settingsFileEngine.saveSettings();
        //then
        assertTrue(result);
    }
}
