package artcode.week4.day1;

/**
 * Created by amakogon on 28.06.2014.
 */
public class TestSync {
    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();
        new Thread(new ClientRunnableImpl(bankAccount)).start();
        new Thread(new ClientRunnableImpl(bankAccount)).start();
        new Thread(new ClientRunnableImpl(bankAccount)).start();
        new Thread(new ClientRunnableImpl(bankAccount)).start();
        new Thread(new ClientRunnableImpl(bankAccount)).start();

        Thread.sleep(4000);
        System.out.println(bankAccount.getAmount());
    }

}
