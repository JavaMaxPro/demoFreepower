package com.example.demo.service;

import com.example.demo.model.UsersCompany;

import java.util.List;

public interface UsersCompanyService {
    UsersCompany register(UsersCompany usersCompany);

    List<UsersCompany> getAll();

    UsersCompany findByUsersCompanylogin(String usersCompanylogin);

    UsersCompany findById(Long id);

    void delete(Long id);
}
