package week6.mysql.Components;

import week6.mysql.Abstractions.AbstractGoods;

/**
 * Created by vkucheru on 17.07.2014.
 */
public class Model extends AbstractGoods {

    public String model;

    public Model(String brand_name, String model) {
        super(brand_name);
        this.model = model;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
