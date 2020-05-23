package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Category_has_Company")
@Data
public class CategoryHasCompany extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "Category_idCategory")
    public Category category;

    @ManyToOne
    @JoinColumn(name = "Company_idCompany")
    public Company company;
}
