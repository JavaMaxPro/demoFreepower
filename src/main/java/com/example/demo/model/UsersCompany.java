package com.example.demo.model;

import lombok.Data;
import org.apache.catalina.LifecycleState;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "UsersCompany")
@Data
public class UsersCompany extends  BaseEntity{


    @Column(name="idUsersCompany")
    private long idUsersCompany = super.getId();

    @Column(name="firstName")
    private String firstName;

    @Column(name="secondName")
    private String secondName;

    @Column(name="email")
    private String email;

    @Column(name="loginCompany")
    private String login;

    @Column(name="passwordCompany")
    private String pass;

    @Column(name="admin")
    private boolean admin;

    @Column(name="manager")
    private boolean manager;

    @Column(name="user")
    private boolean user;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name= "Company_has_Users",
            joinColumns={@JoinColumn(name="Users_idUsersCompany", referencedColumnName = "idUsersCompany")},
            inverseJoinColumns = {@JoinColumn(name = "company_idcompany",referencedColumnName =  "idCompany")}
            )
    private List<Company> company;


}
