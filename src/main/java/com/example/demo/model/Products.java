package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Products")
@Data
public class Products extends BaseEntity{

    @Column(name = "nameProducts")
    private String nameProduct;

    @Column(name = "article")
    private String article;

    @Column(name = "inStoke")
    private Integer inStoke;

    @Column(name = "price")
    private Float price;

    @ManyToOne
    @JoinColumn(name = "Manufactory_idManufactory")
    public ManufactoryP manufactoryP;

    @ManyToOne
    @JoinColumn(name = "Category_idCategory")
    public Category categoryProduct;

    @OneToMany(mappedBy = "productsDocument")
    public List<Documents> documentsList;

    @OneToMany(mappedBy = "productsImage")
    public List<ImageS> imageSList;


}
