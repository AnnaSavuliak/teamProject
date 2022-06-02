package com.annasavuliak.spring.mvc_hibernate_aop.service;

import com.annasavuliak.spring.mvc_hibernate_aop.entity.Visit;

import java.util.List;

public interface VisitService {

    public List<Visit> getAllVisits();

    public void saveVisit(Visit visit);

    public Visit getVisit(int id);

    public void deleteVisit(int id);
}
