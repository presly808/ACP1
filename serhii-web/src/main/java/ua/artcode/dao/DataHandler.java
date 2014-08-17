package ua.artcode.dao;

import ua.artcode.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 16.08.2014.
 */
public class DataHandler {

    private static List<Product> products = init();

    private static List<Product> init(){
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"Notebook",2000));
        list.add(new Product(2,"CPU",300));
        list.add(new Product(3,"RAM",200));
        list.add(new Product(4,"HDD",200));
        list.add(new Product(5,"DISPLAY",1000));

        return list;
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        DataHandler.products = products;
    }
}
