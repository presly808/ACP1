package ua.artcode.week5.day1.prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * Created by admin on 05.07.2014.
 */
public class GameSettings {

    private static GameSettings INSTANCE = new GameSettings();
    private static final String GAME_SETTINGS_PROPERTIES_PATH = "game_settings.properties";

    private Properties properties;

    private GameSettings() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(GAME_SETTINGS_PROPERTIES_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameSettings getINSTANCE(){
        return INSTANCE;
    }

    public void load(String...paths){// new String[]{"one", "second"}
        for(String path : paths){
            try {
                Properties temp = new Properties();
                temp.load(new FileInputStream(path));
                mergeProperty(temp);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void mergeProperty(Properties properties){
        //
        for(Map.Entry<Object,Object> entry : properties.entrySet()){
            this.properties.setProperty(entry.getKey().toString(), entry.getValue().toString());
        }
    }

    public void showAllSetting(){
        Iterator<Map.Entry<Object,Object>> iter = properties.entrySet().iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getKey() + " = " + iter.next().getValue());
        }

    }

    public boolean isEmpty(){
        return properties == null;
    }



}
