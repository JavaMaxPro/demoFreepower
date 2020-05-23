package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Service_has_Company")
@Data
public class ServiceHasCompany extends  BaseEntity{
}
