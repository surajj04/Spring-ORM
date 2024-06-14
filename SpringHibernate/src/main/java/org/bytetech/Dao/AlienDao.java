package org.bytetech.Dao;

import org.bytetech.model.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class AlienDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Alien> getAliens() {
        Session session = sessionFactory.getCurrentSession();
        List<Alien> aliens = session.createQuery("from Alien").list();
        return aliens;
    }

    @Transactional
    public void addAlien(Alien a) {
        Session session = sessionFactory.getCurrentSession();
        session.save(a);
    }

    @Transactional
    public Alien getAlienByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Alien a = (Alien) session.createQuery("from Alien where name = " + name);
        return a;

    }

    @Transactional
    public Alien getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Alien.class, id);
    }

}
