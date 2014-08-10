package ua.artcode.week8.rmi.server;

/**
 * Created by admin on 10.08.2014.
 */
public class RemoteServiceImpl implements RemoteService {


    @Override
    public String getMessage() {
        return "hello";
    }

    @Override
    public String sendMessage(String name) {
        return "hello " + name;
    }
}
