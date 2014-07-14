package artcode.week4.homework.skype;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by amakogon on 02.07.2014.
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        ClientChat client = new ClientChat(new Socket("127.0.0.1",8189),null,"Artem");
        Thread t = new Thread(client);
        t.start();
    }
}
