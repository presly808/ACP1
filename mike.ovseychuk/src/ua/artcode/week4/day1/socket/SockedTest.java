package ua.artcode.week4.day1.socket;

import java.io.IOException;

/**
 * Created by mike on 6/28/14.
 */
public class SockedTest {

    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.connect();
    }
}
