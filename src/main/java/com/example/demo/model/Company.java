package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;
import java.util.List;

@Entity
@Table(name = "Company")
@Data
public class Company extends  BaseEntity{

    @Column(name="nameCompany")
    private String nameCompany;

    @Column(name="logoPicture")
    private String logoPicture;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="Company_has_Users",
            joinColumns = {@JoinColumn(name ="Company_idCompany", referencedColumnName = "id" )},
            inverseJoinColumns = {@JoinColumn(name = "Users_idUsersCompany",referencedColumnName = "id")})

    private List<UsersCompany> usersCompany;

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }
}
