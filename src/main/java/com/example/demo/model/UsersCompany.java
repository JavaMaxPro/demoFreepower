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



    @Column(name="firstName")
    private String firstName;

    @Column(name="secondName")
    private String secondName;

    @Column(name="email")
    private String email;

    @Column(name="loginCompany")
    private String loginCompany;

    @Column(name="passwordCompany")
    private String pass;

    @Enumerated(EnumType.STRING)
    @Column (name = "status")
    private Status status;

    @OneToMany (mappedBy = "usersCompany")
    private List<CompanyHasUsers> companyHasUsers;

    @OneToMany(mappedBy = "usersCompanyUT")
    private List<UsersCompanyHasTable> usersCompanyHasTableList;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "User_Roles",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "roles_id", referencedColumnName = "id")})
    private List<Roles> roles;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginCompany() {
        return loginCompany;
    }

    public void setLoginCompany(String loginCompany) {
        this.loginCompany = loginCompany;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<CompanyHasUsers> getCompanyHasUsers() {
        return companyHasUsers;
    }

    public void setCompanyHasUsers(List<CompanyHasUsers> companyHasUsers) {
        this.companyHasUsers = companyHasUsers;
    }

    public List<UsersCompanyHasTable> getUsersCompanyHasTableList() {
        return usersCompanyHasTableList;
    }

    public void setUsersCompanyHasTableList(List<UsersCompanyHasTable> usersCompanyHasTableList) {
        this.usersCompanyHasTableList = usersCompanyHasTableList;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersCompany that = (UsersCompany) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(secondName, that.secondName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(loginCompany, that.loginCompany) &&
                Objects.equals(pass, that.pass) &&
                status == that.status &&
                Objects.equals(companyHasUsers, that.companyHasUsers) &&
                Objects.equals(usersCompanyHasTableList, that.usersCompanyHasTableList) &&
                Objects.equals(roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, email, loginCompany, pass, status, companyHasUsers, usersCompanyHasTableList, roles);
    }

    @Override
    public String toString() {
        return "UsersCompany{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", loginCompany='" + loginCompany + '\'' +
                ", pass='" + pass + '\'' +
                ", status=" + status +
                ", companyHasUsers=" + companyHasUsers +
                ", usersCompanyHasTableList=" + usersCompanyHasTableList +
                ", roles=" + roles +
                '}';
    }
}
