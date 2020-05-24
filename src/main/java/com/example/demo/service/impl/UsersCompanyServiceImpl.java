package com.example.demo.service.impl;

import com.example.demo.model.Status;
import com.example.demo.model.UsersCompany;
import com.example.demo.repository.UsersCompanyRepository;
import com.example.demo.service.UsersCompanyService;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class UsersCompanyServiceImpl implements UsersCompanyService {


    public Logger log;

    private UsersCompanyRepository usersCompanyRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UsersCompanyServiceImpl(UsersCompanyRepository usersCompanyRepository, BCryptPasswordEncoder passwordEncoder) {
        this.usersCompanyRepository = usersCompanyRepository;
        this.passwordEncoder=passwordEncoder;
    }

    @Override
    public UsersCompany register(UsersCompany usersCompany) {

        //Зашифровываем пароль для БД
        usersCompany.setPass(passwordEncoder.encode(usersCompany.getPass()));
        usersCompany.setStatus(Status.ACTIVE);

        UsersCompany registeredUsersCompany = usersCompanyRepository.save(usersCompany);

        log.info("IN reggister - user: {} successfully registered", registeredUsersCompany);

       // usersCompany.setCompanyHasUsers();
        return registeredUsersCompany;
    }

    @Override
    public List<UsersCompany> getAll() {
        List<UsersCompany> result = usersCompanyRepository.findAll();
        log.info("IN getAll -{} user found",result.size());
        return result;
    }

    @Override
    public UsersCompany findByUsersCompanylogin(String usersCompanylogin) {
        UsersCompany result =usersCompanyRepository.findByLoginCompany(usersCompanylogin);
        log.info("IN  findByUsersCompanylogin - user : found by loggin : {}", result , usersCompanylogin);
        return result;
    }

    @Override
    public UsersCompany findByid(Long id) {
        UsersCompany result =usersCompanyRepository.findById(id).orElse(null);

        if(result == null){
            log.warn("IN findById - no user found by id: {}", id);
            return null;
        }
        log.info("IN  findById - user : found by id: {}", result );
        return result;
    }

    @Override
    public void delete(long id) {
        usersCompanyRepository.deleteById(id);
        log.info("IN delete - user with id: {} successfully delete");
    }
}
