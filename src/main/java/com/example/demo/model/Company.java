package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;
import java.util.List;

@Entity
@Table(name = "Company")
@Data
public class Company extends  BaseEntity{

    @Column(name="nameCompany")
    private String nameCompany;

    @Column(name="logoPicture")
    private String logoPicture;

    @OneToMany(mappedBy = "company")
    private List<CategoryHasCompany> categoryHasCompanyList;

    @OneToMany(mappedBy = "companyS")
    private List<ServiceHasCompany> serviceHasCompanyList;

    @OneToMany(mappedBy = "companyProducts")
    private List<CompanyHasProducts> companyHasProducts;

    @OneToMany(mappedBy = "companyUsers")
    private List<CompanyHasUsers> companyHasUsers ;


}
