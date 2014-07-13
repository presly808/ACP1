package ua.artcode.week5.day1.prop;

/**
 * Created by admin on 05.07.2014.
 */
public class TestGameSettings {

    public static void main(String[] args) {
        GameSettings settings = GameSettings.getINSTANCE();
        settings.load("1.properties", "2.properties");
        settings.showAllSetting();
    }
}
