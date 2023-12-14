package DAO;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import models.Manufacturer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class ManufacturerDAO {

    public void save(Manufacturer manufacturer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(manufacturer);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void update(Manufacturer manufacturer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.update(manufacturer);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void delete(Manufacturer manufacturer) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(manufacturer);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public Manufacturer get(Long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();

        Manufacturer manufacturer = null;
        try {
            manufacturer = (Manufacturer) session.get(Manufacturer.class, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return manufacturer;
    }

    public List<Manufacturer> getAll() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        List<Manufacturer> manufacturers = null;
        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Manufacturer> criteria = builder.createQuery(Manufacturer.class);
            criteria.from(Manufacturer.class);
            manufacturers = session.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return manufacturers;
    }
}

