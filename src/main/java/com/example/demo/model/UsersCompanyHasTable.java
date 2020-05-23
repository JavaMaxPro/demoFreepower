package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UsersCompany_has_Table")
@Data
public class UsersCompanyHasTable extends BaseEntity{
}
