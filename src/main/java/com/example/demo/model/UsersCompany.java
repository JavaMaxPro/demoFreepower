package com.example.demo.model;

import java.util.Objects;

public class UsersCompany {


    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String loginCompany;
    private String passwordCompany;
    boolean admin;
    boolean manager;
    boolean user;

    public UsersCompany(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getPasswordCompany() {
        return passwordCompany;
    }

    public void setPasswordCompany(String passwordCompany) {
        this.passwordCompany = passwordCompany;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public boolean isUser() {
        return user;
    }

    public void setUser(boolean user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersCompany that = (UsersCompany) o;
        return id == that.id &&
                admin == that.admin &&
                manager == that.manager &&
                user == that.user &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(loginCompany, that.loginCompany) &&
                Objects.equals(passwordCompany, that.passwordCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, loginCompany, passwordCompany, admin, manager, user);
    }

    @Override
    public String toString() {
        return "UsersCompany{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", loginCompany='" + loginCompany + '\'' +
                ", passwordCompany='" + passwordCompany + '\'' +
                ", admin=" + admin +
                ", manager=" + manager +
                ", user=" + user +
                '}';
    }
}
