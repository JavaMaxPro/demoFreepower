package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Table")
@Data
public class TableS extends BaseEntity{

    @Column(name = "nameTable")
    private String nameTable;

    @Column(name = "numberTable")
    private Integer numberTable;

    @Column(name = "idUesrsEdit")
    private long idUsers;

    @OneToMany(mappedBy = "tableSUT")
    private List<UsersCompanyHasTable> usersCompanyHasTableList;

}
