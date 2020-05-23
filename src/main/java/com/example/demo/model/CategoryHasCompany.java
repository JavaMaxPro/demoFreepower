package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Category_has_Company")
@Data
public class CategoryHasCompany extends BaseEntity{
}
