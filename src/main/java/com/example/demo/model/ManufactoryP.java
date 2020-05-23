package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Manufactory")
@Data
public class ManufactoryP extends BaseEntity{

    @Column(name = "nameManufactory")
    private String nameManufactoryP;

    @Column(name = "country")
    private String Country;

    @Column(name = "specification")
    private String Specification;

    @OneToMany(mappedBy = "manufactoryP")
    public List<Products> productsList;

    @OneToMany(mappedBy = "manufactoryS")
    public List<Service> serviceList;

}
