package bootcamp.patterns.singleton;

import bootcamp.patterns.enums.hotel.Season;

public enum SettingsFileEngine {

    INSTANCE;

    public String fileName;

    public String getFilename() {
        return fileName;
    }

    public void open(final String filename) {
        this.fileName = filename;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to file");
        return true;
    }
}
