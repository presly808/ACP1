package artcode.week5.day1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by amakogon on 05.07.2014.
 */
public class TestGameSettings {

    public static void main(String[] args) {
        GameSettings gameSettings = GameSettings.getGameSettings();
//        gameSettings.showAllSettings();
//        System.out.println("~~~~~~~~~~~~");
//        gameSettings.addProperty("complexity", "easy");
//        gameSettings.showAllSettings();
//        System.out.println("~~~~~~~~~~~~");
//        gameSettings.removeProperty("complexity");
//        gameSettings.showAllSettings();
//        System.out.println("~~~~~~~~~~~~");

        List<String> paths = Arrays.asList("amakogon/resources/game.settings","amakogon/resources/test.settings");
        gameSettings.load(paths);
        gameSettings.showAllSettings();
    }
}
