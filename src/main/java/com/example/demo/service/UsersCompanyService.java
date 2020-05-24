package com.example.demo.service;

import com.example.demo.model.UsersCompany;

import java.util.List;

public interface UsersCompanyService {
    UsersCompany register(UsersCompany usersCompany);

    List<UsersCompany> getAll();

    UsersCompany findByUsersCompanylogin(String usersCompanylogin);

    UsersCompany findByid (long id);

    void delete(long id);
}
