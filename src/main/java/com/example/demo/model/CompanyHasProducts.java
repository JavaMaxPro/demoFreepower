package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Company_has_Products")
@Data
public class CompanyHasProducts extends BaseEntity{

    @Column(name = "price")
    private float price;

    @Column(name = "discount")
    private Integer discount;

    @ManyToOne
    @JoinColumn(name = "Products_idProducts")
    public Products products;

    @ManyToOne
    @JoinColumn(name = "Company_idCompany")
    public Company companyProducts;


}
