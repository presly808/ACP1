package ua.artcode.week4.day2.login;

import java.io.*;
import java.nio.Buffer;
import java.util.Date;
import java.util.logging.*;

/**
 * Created by mike on 6/29/14.
 */
public class MainLogging {

    private static final Logger LOGGER = Logger.getLogger(MainLogging.class.getName());

    public static void main(String[] args) throws IOException {

        LOGGER.setLevel(Level.FINEST);

        LOGGER.log(Level.INFO, "start program");  //information level

        for (int i = 0; i < 12; i++) {

            LOGGER.fine(String.valueOf(i));      //level for programmers debug
        }

        FileHandler fileHandler = new FileHandler("/home/mike/test.log", true);
        fileHandler.setLevel(Level.FINEST);

        fileHandler.setFormatter( new Formatter() {
            @Override
            public String format(LogRecord record) {
                return new Date().toString() + record.getSourceClassName()+ " " + record.getMessage() + " /n";
            }
        });

        LOGGER.addHandler(fileHandler);

        File file = new File("/home/mike/12345.txt");
        try {
            BufferedReader buf = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            LOGGER.severe(e.getMessage());      //hiest level
        }
    }
}

class MyHandler extends FileHandler
{

    public MyHandler() throws IOException, SecurityException {
    }


}

