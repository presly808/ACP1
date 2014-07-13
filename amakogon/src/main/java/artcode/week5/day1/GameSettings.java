package main.java.artcode.week5.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

/**
 * Created by amakogon on 05.07.2014.
 */
public class GameSettings {

    private static final String PATH_TO_SETTINGS = "amakogon/resources/game.settings";
    private static GameSettings settings = null;

    private Properties properties;


    private GameSettings() {
        try {
           properties = new Properties();
           FileInputStream fileInputStream = (new FileInputStream(new File(PATH_TO_SETTINGS)));
           properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameSettings getGameSettings(){
        if(settings == null){
            synchronized (GameSettings.class){
                if(settings == null){
                    settings = new GameSettings();
                }
            }
        }
        return settings;
    }

    public void showAllSettings(){
        Set<String> propertySet = properties.stringPropertyNames();
        for(String property : propertySet){
            System.out.println(property + "=" + properties.getProperty(property));
        }
    }

    public void removeProperty(String key){
        properties.remove(key);
    }

    public void addProperty(String key, String value){
        properties.put(key,value);
    }

    public void load(List<String> propertiesPathList){
        for (String path : propertiesPathList){
            try {
                properties.load(new FileInputStream(new File(path)));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
