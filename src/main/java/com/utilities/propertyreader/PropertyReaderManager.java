package com.utilities.propertyreader;

/**
 * Get instance of PropertiesReader
 */

public class PropertyReaderManager {
    private static PropertyReaderManager instance;
    private static ConfigPropertiesReader configPropertiesReader;
    private static ObjectRepositoryReader objectRepositoryReader;

    // private constructor in singleton design pattern
    private PropertyReaderManager() {}

    public static PropertyReaderManager getInstance() {
        if(instance == null) {
            instance = new PropertyReaderManager();
        }
        return instance;
    }

    //Get instance of ConfigPropertiesReader
    public ConfigPropertiesReader getConfigPropertiesReader() {
        return (configPropertiesReader == null) ? new ConfigPropertiesReader() : configPropertiesReader;
    }

    //Get instance of ObjectRepositoryReader(
    public ObjectRepositoryReader getObjectRepositoryReader() {
        return  (objectRepositoryReader == null) ? new ObjectRepositoryReader() : objectRepositoryReader;
    }


}
