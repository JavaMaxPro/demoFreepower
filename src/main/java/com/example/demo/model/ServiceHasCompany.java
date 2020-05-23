package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Service_has_Company")
@Data
public class ServiceHasCompany extends  BaseEntity{

    @Column(name = "price")
    private Float price;

    @Column(name = "category")
    private String category;

    @ManyToOne
    @JoinColumn(name = "Service_idService")
    public Service serviceC;

    @ManyToOne
    @JoinColumn(name = "Company_idCompany")
    public Company companyS;

}
