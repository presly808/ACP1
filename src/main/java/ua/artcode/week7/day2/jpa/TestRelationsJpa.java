package ua.artcode.week7.day2.jpa;

import org.hibernate.criterion.Restrictions;
import ua.artcode.week7.day1.jpa.Author;
import ua.artcode.week7.day1.jpa.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import java.beans.Expression;
import java.util.List;

/**
 * Created by admin on 20.07.2014.
 */
public class TestRelationsJpa {
    public static void main(String[] args) {
        EntityManager entityManager = EntityFactoryHolder.getEntityManagerFactory().createEntityManager();

        /*Author author = new Author();
        author.setName("Andrey");

        Book book = new Book();
        book.setName("Roman");
        book.setAuthor(author);

        author.getBookList().add(book);

        entityManager.getTransaction().begin();
        entityManager.persist(author);
        entityManager.getTransaction().commit();*/


        //findById(3L, entityManager);
        findBookById(1L, entityManager);
        findByName("Andrey", entityManager);
    }

    public static void findById(Long id, EntityManager entityManager) {
        List<Author> list = entityManager.createQuery("SELECT a FROM Author a WHERE a.id = 3").setMaxResults(1).getResultList();
        Author author = list.get(0);
        System.out.println(author.getBookList().isEmpty());
    }

    public static void findBookById(Long id, EntityManager entityManager) {
        Book book = entityManager.find(Book.class, id);
    }

    public static void findByName(String name, EntityManager entityManager){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        javax.persistence.criteria.CriteriaQuery query = criteriaBuilder.createQuery(Author.class);
        Root<Author> authorRoot = query.from(Author.class);
        for(Object author : query.getOrderList()){
            System.out.println(author);
        }
    }



}
