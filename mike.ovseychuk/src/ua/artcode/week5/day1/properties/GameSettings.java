package ua.artcode.week5.day1.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by mike on 7/5/14.
 */
public class GameSettings {

    private static GameSettings instance;

    private static java.util.Properties properties;
    private static final String PATH = "/home/mike/server.properties";

    private GameSettings(){
        
        properties = new Properties();
        try {
            properties.load(new FileInputStream(PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static GameSettings getInstance()
    {
        if (instance == null)
        {
            instance = new GameSettings();
        }
        return instance;
    }

    public void showAllSettings()
    {
       Set settingsSet = properties.entrySet();
        for (Object s: settingsSet) {
            System.out.println(s.toString());
        }
    }

    public void addNewSettings(String key, String value)
    {
        properties.setProperty(key, value);
    }

    public void removeByKey(String key)
    {
        properties.remove(key);
    }

    public void save()
    {
            try {
                properties.store(new FileOutputStream(PATH), "saved");
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    public void load(String ... paths)
    {

        for (String path: paths)
        {
            Properties temp = new Properties();

            try {
                temp.load(new FileInputStream(path));
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Map.Entry<Object, Object> entry : temp.entrySet())
            {
                properties.setProperty(entry.getKey().toString(), entry.getValue().toString());
            }

        }
    }


    }




