package com.annasavuliak.spring.mvc_hibernate_aop.service;

import com.annasavuliak.spring.mvc_hibernate_aop.dao.VisitDAO;
import com.annasavuliak.spring.mvc_hibernate_aop.entity.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VisitServiceImpl implements VisitService{

    @Autowired
    private VisitDAO visitDAO;

    @Override
    @Transactional
    public List<Visit> getAllVisits() {
        return visitDAO.getAllVisits();
    }

    @Override
    @Transactional
    public void saveVisit(Visit visit) {
        visitDAO.saveVisit(visit);
    }

    @Override
    @Transactional
    public Visit getVisit(int id) {
        return visitDAO.getVisit(id);
    }

    @Override
    @Transactional
    public void deleteVisit(int id) {
        visitDAO.deleteVisit(id);
    }
}
