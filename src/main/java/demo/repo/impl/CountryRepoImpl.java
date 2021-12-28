package demo.repo.impl;

import demo.entities.Country;
import demo.repo.CountryRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryRepoImpl implements CountryRepo {
    @Autowired
    private final SessionFactory sessionFactory;

    public CountryRepoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Country> findAllCountries() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            List list = session.createQuery("from Country").list();
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public boolean insertCountry(Country p) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(p);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }
}
