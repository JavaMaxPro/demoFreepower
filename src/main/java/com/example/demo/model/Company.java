package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Objects;

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nameCompany;
    private String logoPicture;
    private Date dateCreate;
    private Date dateEdit;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getLogoPicture() {
        return logoPicture;
    }

    public void setLogoPicture(String logoPicture) {
        this.logoPicture = logoPicture;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Date getDateEdit() {
        return dateEdit;
    }

    public void setDateEdit(Date dateEdit) {
        this.dateEdit = dateEdit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return id == company.id &&
                Objects.equals(nameCompany, company.nameCompany) &&
                Objects.equals(logoPicture, company.logoPicture) &&
                Objects.equals(dateCreate, company.dateCreate) &&
                Objects.equals(dateEdit, company.dateEdit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameCompany, logoPicture, dateCreate, dateEdit);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", nameCompany='" + nameCompany + '\'' +
                ", logoPicture='" + logoPicture + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateEdit=" + dateEdit +
                '}';
    }
}
