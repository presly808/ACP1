package artcode.week4.homework.skype.chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;
import java.util.Properties;

/**
 * Created by amakogon on 03.07.2014.
 */
public class ChatClient {

    private static final String PATH_TO_PROPERTIES = "amakogon/resources/connection.properties";
    private JTextArea incoming;
    private JTextField outgoing;
    private JFrame frame;
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;
    private String userName;

    private String serverHost;
    private int serverPort;


    private volatile static int countClients = 0;

    private ChatClient() {
        System.out.println("user not created");
    }

    private ChatClient(String userName) {
        this.userName = userName;
        setConnection();
        startChat();
    }

    public static synchronized ChatClient createInstance(String userName) {
        if (countClients < 2) {
            countClients++;
            System.out.println(countClients);
            return new ChatClient(userName);
        }
        return new ChatClient();
    }

    private void setConnection() {
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(new File(PATH_TO_PROPERTIES));
            properties.load(fis);
            this.serverHost = properties.getProperty("server.host");
            this.serverPort = Integer.valueOf(properties.getProperty("server.port"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startChat() {
        initFrame();
        setUpNetworking();
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();
    }

    private void initFrame() {
        frame = new JFrame("Chat client");
        JPanel mainPanel = new JPanel();
        incoming = new JTextArea(10, 30);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new CloseButtonListener());
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        mainPanel.add(closeButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void setUpNetworking() {
        try {
            socket = new Socket(serverHost, serverPort);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class SendButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            writer.println(userName + " : " + outgoing.getText());
            writer.flush();
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }

    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    incoming.append(message + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized static void minus() {
        System.out.println(--countClients);
    }

    private class CloseButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
            writer.println("^^&&^^exit!@qwe");
            writer.flush();
            frame.dispose();
            minus();
        }
    }
}
