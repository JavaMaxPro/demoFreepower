package com.example.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="UsersCompany")
@Data
public class UsersCompany extends  BaseEntity{


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




}
