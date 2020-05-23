package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Category")
@Data
public class Category extends BaseEntity{

    @Column(name="nameCategory")
    private String nameCategory;

    @Column(name="parentCategory")
    private String parentCategory;

    @OneToMany(mappedBy = "category")
    public List<CategoryHasCompany> categoryHasCompany;

    @OneToMany(mappedBy = "categoryProduct")
    public List<Products> productsList;
}
