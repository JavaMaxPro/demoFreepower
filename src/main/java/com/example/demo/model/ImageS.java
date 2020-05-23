package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Image")
@Data
public class ImageS extends BaseEntity{
    @Column(name = "numberImage")
    private Integer number;

    @Column(name = "urlImage")
    private String urlImage;

    @ManyToOne
    @JoinColumn(name = "Products_idProducts")
    public Products productsImage;

    @ManyToOne
    @JoinColumn(name = "Service_idService")
    public Service serviceImage;
}
