package dao;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class BookDAO {
    public void create(Book book) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Transaction transaction = null;
        try(Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.persist(book);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
    }

    public void update(Book book) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(book);
          /*  Book bookPersisted = session.find(Book.class, book.getId());
            bookPersisted.setTitle(book.getTitle());
            bookPersisted.setAuthor(book.getAuthor());
            bookPersisted.setPublished(book.getPublished());
            bookPersisted.setBookType(book.getBookType());*/
            transaction.commit();
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }


    }
}
