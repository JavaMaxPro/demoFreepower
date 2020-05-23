package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "UsersCompany_has_Table")
@Data
public class UsersCompanyHasTable extends BaseEntity{

    @Column(name = "access")
    private boolean access;

    @ManyToOne
    @JoinColumn(name = "Table_idTable")
    private TableS tableSUT;

    @ManyToOne
    @JoinColumn(name = "Table_idTable")
    private UsersCompany usersCompanyUT;
}
