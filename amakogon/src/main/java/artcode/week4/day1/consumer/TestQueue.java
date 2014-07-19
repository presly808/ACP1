package artcode.week4.day1.consumer;

/**
 * Created by amakogon on 28.06.2014.
 */
public class TestQueue {
    public static void main(String[] args) throws InterruptedException {
        final Queue<String> queue = new Queue<String>();
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//        queue.add("4");
//        queue.showQueue();
//        queue.remove();
//        queue.remove();
//        System.out.println("After remove");
//        queue.showQueue();
//        queue.add("5");
//        System.out.println("add 5");
//        queue.showQueue();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!Thread.currentThread().isInterrupted()){
                    queue.add(String.valueOf(i));
                    i++;
                }
            }
        });
        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {

                while (!Thread.currentThread().isInterrupted()){
                    queue.remove();
                }
            }
        });
        producer.start();
        consumer.start();

        Thread.currentThread().sleep(3000);
        consumer.interrupt();
        producer.interrupt();
        queue.showQueue();


    }
}
