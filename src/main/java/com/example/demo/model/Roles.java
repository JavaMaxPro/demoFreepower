package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<UsersCompany> getUsersCompany() {
        return usersCompany;
    }

    public void setUsersCompany(List<UsersCompany> usersCompany) {
        this.usersCompany = usersCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roles roles = (Roles) o;
        return Objects.equals(name, roles.name) &&
                status == roles.status &&
                Objects.equals(usersCompany, roles.usersCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, usersCompany);
    }

    @Override
    public String toString() {
        return "Roles{" +
                "name='" + name + '\'' +
                ", status=" + status +
                ", usersCompany=" + usersCompany +
                '}';
    }
}
