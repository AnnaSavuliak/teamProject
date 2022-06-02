package com.annasavuliak.spring.mvc_hibernate_aop.entity;
import javax.persistence.*;

@Entity
@Table(name = "visits")
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "service")
    private String service;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "visit_date")
    private String visit_date;
    @Column(name = "comments")
    private String comments;


    public Visit() {
    }

    public Visit(int id, String name, String surname, String service, String telephone, String visit_date, String comments) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.service = service;
        this.telephone = telephone;
        this.visit_date = visit_date;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVisit_date() {
        return visit_date;
    }

    public void setVisit_date(String visit_date) {
        this.visit_date = visit_date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
