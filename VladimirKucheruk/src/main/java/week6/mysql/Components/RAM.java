package week6.mysql.Components;

import week6.mysql.Abstractions.AbstractGoods;

/**
 * Created by vkucheru on 18.07.2014.
 */
public class RAM extends AbstractGoods {

    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public RAM(String brand_name, int volume) {
        super(brand_name);
        this.volume = volume;
    }
}
