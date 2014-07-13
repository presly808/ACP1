package main.java.artcode.week4.homework.skype.chat;

import java.util.Scanner;

/**
 * Created by amakogon on 03.07.2014.
 */
public class TestClient {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter user name");
            String nick = sc.nextLine();
            if(nick.equals("exit")){
                break;
            }
            ChatClient client = ChatClient.createInstance(nick);
        }

    }
}
