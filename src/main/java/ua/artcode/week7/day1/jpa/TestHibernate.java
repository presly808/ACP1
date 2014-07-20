package ua.artcode.week7.day1.jpa;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 18.07.2014.
 */
public class TestHibernate {

    public static void main(String[] args) {

        Man man = new Man("Serhii", new Date());

        // fabric of connection and structute
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("my_unit");

        EntityManager entityManager = managerFactory.createEntityManager(); //connection

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(man);
        entityTransaction.commit();


        Query query = entityManager.createQuery("SELECT m from Man m where m.name = :name").setParameter("name", "Serhii");
        List<Man> list = query.getResultList();
        for(Man m : list){
            System.out.println(m.getName());
        }

    }


}
