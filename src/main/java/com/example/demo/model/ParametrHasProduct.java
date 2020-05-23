package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Parameter_has_Product")
@Data
public class ParametrHasProduct extends BaseEntity{
}
