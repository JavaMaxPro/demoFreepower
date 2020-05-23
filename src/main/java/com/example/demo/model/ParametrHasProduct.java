package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Parameter_has_Product")
@Data
public class ParametrHasProduct extends BaseEntity{

    @Column(name = "numberValue")
    private Float numberValue;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "Parameter_idParameter")
    public ParametrP parametrP;

    @ManyToOne
    @JoinColumn(name = "Products_idProducts")
    public Products productsParametr;

}
