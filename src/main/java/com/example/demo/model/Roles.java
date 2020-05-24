package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Roles")
@Data
public class Roles extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column (name = "status")
    private Status status;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<UsersCompany> usersCompany;
}
