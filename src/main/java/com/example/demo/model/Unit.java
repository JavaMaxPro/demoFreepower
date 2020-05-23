package com.example.demo.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Unit")
@Data
public class Unit extends BaseEntity{

    @Column(name = "numberTable")
    private Integer numberTable;

    @Column(name = "clickable")
    private boolean clickable;

    @Column(name = "x1y1x2y2")
    @Type(type = "Integer[]")
    private Integer[] coordinate;

    @ManyToOne
    @JoinColumn(name = "Table_idTable")
    private TableSV tableSVUn;

    @ManyToOne
    @JoinColumn(name = "Products_idProducts")
    private Products productsUn;

    @ManyToOne
    @JoinColumn(name = "Service_idService")
    private Service serviceUn;
}
