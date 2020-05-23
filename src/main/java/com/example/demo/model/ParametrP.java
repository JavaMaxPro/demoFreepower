package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Parameter")
@Data
public class ParametrP extends BaseEntity{

    @Column(name = "nameParameter")
    private String nameParametr;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "productsParametr")
    public List<ParametrHasProduct> parametrHasProducts;

}
