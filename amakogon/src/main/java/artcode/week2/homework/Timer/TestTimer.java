package artcode.week2.homework.Timer;


/**
 * Created by amakogon on 20.06.2014.
 */
public class TestTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.start(2, new Action() {
            @Override
            public void perform() {
                System.out.println("Hello");
            }
        });


    }

}
