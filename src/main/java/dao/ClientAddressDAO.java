package dao;

import entity.ClientAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class ClientAddressDAO {

    public void create(ClientAddress clientAddress) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.persist(clientAddress);
            transaction.commit();
        } finally {
            session.close();
        }
    }
}
