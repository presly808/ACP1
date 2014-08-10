package ua.artcode.week8.rmi.server;

/**
 * Created by admin on 10.08.2014.
 */
public interface RemoteService {

    String getMessage();

    String sendMessage(String message);

}
