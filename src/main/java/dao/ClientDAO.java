package dao;

import entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

    public void create(Client client) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            session.persist(client);
            transaction.commit();
        } finally {
            session.close();
        }
    }

    public List<Client> findByCity(String city) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();

        List<Client> clients = new ArrayList<>();
        try {
            String query = "select e from Client e " +
                    "where e.clientAddress.city = :city";
            clients = session.createQuery(query).setParameter("city", city).getResultList();
        } finally {
            session.close();
        }
        return clients;
    }
}
