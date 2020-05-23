package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Company_has_Users")
@Data
public class CompanyHasUsers extends BaseEntity {
}
