package com.annasavuliak.spring.mvc_hibernate_aop.dao;


import com.annasavuliak.spring.mvc_hibernate_aop.entity.Visit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VisitDAOImpl implements VisitDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Visit> getAllVisits() {
        Session session = sessionFactory.getCurrentSession();
        List<Visit> allVisits = session.createQuery("from Visit", Visit.class).getResultList();
        return allVisits;
    }

    @Override
    public void saveVisit(Visit visit) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(visit);
    }

    @Override
    public Visit getVisit(int id) {
        Session session = sessionFactory.getCurrentSession();
        Visit visit = session.get(Visit.class, id);
        return visit;
    }

    @Override
    public void deleteVisit(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Visit> query = session.createQuery("delete from Visit where id =:visitId");
        query.setParameter("visitId", id);
        query.executeUpdate();
    }
}
