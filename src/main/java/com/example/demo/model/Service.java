package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Service")
@Data
public class Service extends BaseEntity{

    @Column(name = "nameService")
    private String nameService;

    @Column(name = "nameService", columnDefinition = "TEXT")
    private String textService;

    @ManyToOne
    @JoinColumn(name = "Manufactory_idManufactory")
    public ManufactoryP manufactoryS;

    @OneToMany(mappedBy = "serviceDocument")
    public List<Documents> documentsList;

    @OneToMany(mappedBy = "serviceImage")
    public List<ImageS> imageSList;

    @OneToMany(mappedBy = "serviceC")
    public List<ServiceHasCompany> serviceHasCompanyList;
}
