package ua.artcode.week7.day2.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by admin on 20.07.2014.
 */
public class EntityFactoryHolder {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = init();


    private static EntityManagerFactory init(){
        return Persistence.createEntityManagerFactory("my_unit");
    }

    public static final EntityManagerFactory getEntityManagerFactory(){
        return ENTITY_MANAGER_FACTORY;
    }


 }
