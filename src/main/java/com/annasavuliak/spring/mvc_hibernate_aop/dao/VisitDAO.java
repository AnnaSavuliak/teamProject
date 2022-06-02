package com.annasavuliak.spring.mvc_hibernate_aop.dao;

import com.annasavuliak.spring.mvc_hibernate_aop.entity.Visit;

import java.util.List;

public interface VisitDAO {
    public List<Visit> getAllVisits();

    public void saveVisit(Visit visit);

    public Visit getVisit(int id);

    public void deleteVisit(int id);
}
