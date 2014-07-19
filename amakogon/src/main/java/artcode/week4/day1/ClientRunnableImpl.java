package artcode.week4.day1;

/**
 * Created by amakogon on 28.06.2014.
 */
public class ClientRunnableImpl implements Runnable {

    private BankAccount account;

    public ClientRunnableImpl(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            account.put(1);
        }

    }


}
