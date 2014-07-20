package ua.artcode.week7.day2.jpa;

import ua.artcode.week7.day1.jpa.Author;
import ua.artcode.week7.day1.jpa.Book;
import ua.artcode.week7.day1.jpa.Producer;

import javax.persistence.EntityManager;

/**
 * Created by admin on 20.07.2014.
 */
public class TestLinksInHibern {
    public static void main(String[] args) {
        EntityManager entityManager = EntityFactoryHolder.getEntityManagerFactory().createEntityManager();

        Book book = new Book();
        book.setName("How to be");

        Author author = new Author();
        author.setName("Norbekov");

        author.getBookList().add(book);

        book.setAuthor(author);

        Producer producer = new Producer();
        producer.getAuthors().add(author);
        author.setProducer(producer);

        //JPA - Java Persistence API, JTA - Java Transaction API
        entityManager.getTransaction().begin();
        entityManager.persist(producer);
        entityManager.getTransaction().commit();

        System.out.println("end");



    }
}
