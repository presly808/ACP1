package week6.mysql.Abstractions;

/**
 * Created by vkucheru on 17.07.2014.
 */
public abstract class AbstractGoods {

    public int id;
    public String brand_name;

    protected AbstractGoods(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getId() {
        return id;

    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }
}
