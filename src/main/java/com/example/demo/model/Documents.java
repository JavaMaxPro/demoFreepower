package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Documents")
@Data
public class Documents extends BaseEntity{

    @Column(name = "nameDocuments")
    private String nameDocument;

    @Column(name = "urlDocuments")
    private String urlDocument;

    @ManyToOne
    @JoinColumn(name = "Products_idProducts")
    public Products productsDocument;

    @ManyToOne
    @JoinColumn(name = "Service_idService")
    public Service serviceDocument;
}
