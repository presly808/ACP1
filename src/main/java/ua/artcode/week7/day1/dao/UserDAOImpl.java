package ua.artcode.week7.day1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.artcode.week7.day1.jpa.Author;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by admin on 10.08.2014.
 */
@Repository
public class UserDAOImpl implements UserDAO{

    @Autowired
    private EntityManagerFactory managerFactory;


    @Override
    @Transactional
    public void save(Author author) {
        EntityManager entityManager = managerFactory.createEntityManager();
        try {
            /*entityManager.getTransaction().begin();*/
            entityManager.persist(author);
            /*entityManager.getTransaction().commit();*/
        } catch (Exception ex) {
            ex.printStackTrace();
           /* entityManager.getTransaction().rollback();*/
        }
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Author> all() {
        return null;
    }
}
