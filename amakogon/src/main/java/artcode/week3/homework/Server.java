package artcode.week3.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by amakogon on 27.06.2014.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8189);
        int i = 1;

        while (true) {
            Socket incoming = serverSocket.accept();
            System.out.println("Spawning " + incoming.getInetAddress());
            Runnable r = new ThreadedEchoHandler(incoming, i);

            Thread t = new Thread(r);
            t.start();
            i++;
        }

    }

    private static class ThreadedEchoHandler implements Runnable {

        private Socket incoming;
        private int counter;

        private ThreadedEchoHandler(Socket incoming, int counter) {
            this.incoming = incoming;
            this.counter = counter;
        }

        @Override
        public void run() {
            try {
                InputStream inputStream = incoming.getInputStream();
                OutputStream outputStream = incoming.getOutputStream();
                Scanner in = new Scanner(inputStream);
                PrintWriter out = new PrintWriter(outputStream, true);
                out.println("Hello! Enter BYE to exit");
                System.out.println("test");
                boolean done = false;
                while (!done && in.hasNextLine()) {
                    String line = in.nextLine();
                    out.println("Echo: " + line);
                    System.out.println(line);
                    if (line.trim().equals("BYE")) {
                        done = true;
                    }
                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    incoming.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
