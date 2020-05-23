package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Company_has_Users")
@Data
public class CompanyHasUsers extends BaseEntity {

    private boolean access;

    @ManyToOne
    @JoinColumn(name = "Company_idCompany")
    public Company companyUsers;

    @ManyToOne
    @JoinColumn(name = "Company_idCompany")
    public UsersCompany usersCompany;
}
