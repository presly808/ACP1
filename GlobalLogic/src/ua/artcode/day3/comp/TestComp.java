package ua.artcode.day3.comp;

/**
 * Created by admin on 15.07.2014.
 */
public class TestComp {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5]; // null

        Coder coder = new Coder("Serhii", 28,2000, "Middle", 3);
        Tester tester = new Tester("Vasia", 22, 1500);

        workers[0] = coder;
        workers[1] = tester;
        workers[2] = new Worker("Andrey", 27, 1000);

        for(int i = 0; i < 3; i++){
            workers[i].work();
        }

        /*filterWorker(tester);
        filterWorker(coder);*/
    }

    //Example of flexible structure
    public static void filterWorker(Worker worker){
        worker.work();
    }
}
