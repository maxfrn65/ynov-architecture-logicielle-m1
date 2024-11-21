package org.example.creational.tp;

import org.example.creational.singleton.OrderManagementService;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Configuration {

    Map<String, String> settings;
    private static Configuration instance;
    private Configuration() {
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getSettings(String key) {
        return settings.get(key);
    }

    public static Configuration setSettings(String key, String value) {

    }
}
