package ua.artcode.dao;

import ua.artcode.entity.Product;

import java.util.List;

/**
 * Created by admin on 16.08.2014.
 */
public class ProductDao implements Dao<Product> {

    @Override
    public void create(Product product) {

    }

    @Override
    public Product find(int id) {

        for(Product product : DataHandler.getProducts()){
            if(product.getId() == id){
                return product;
            }
        }

        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> findAll() {
        return DataHandler.getProducts();
    }
}
