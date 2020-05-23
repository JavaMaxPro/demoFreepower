package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Image")
@Data
public class Image extends BaseEntity{
}
