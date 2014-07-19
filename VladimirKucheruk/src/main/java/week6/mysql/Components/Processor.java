package week6.mysql.Components;

import week6.mysql.Abstractions.AbstractGoods;

/**
 * Created by vkucheru on 18.07.2014.
 */
public class Processor extends AbstractGoods {

    public int clock_frequency;

    public Processor(String brand_name, int clock_frequency) {
        super(brand_name);
        this.clock_frequency = clock_frequency;
    }

    public int getClock_frequency() {
        return clock_frequency;
    }

    public void setClock_frequency(int clock_frequency) {
        this.clock_frequency = clock_frequency;
    }
}
