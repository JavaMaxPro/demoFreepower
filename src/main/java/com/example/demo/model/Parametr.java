package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Parameter")
@Data
public class Parametr extends BaseEntity{
}
