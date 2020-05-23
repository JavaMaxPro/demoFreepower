package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @CreatedDate
    @Column(name = "create")
    private Date create;

    @LastModifiedDate
    @Column(name = "update")
    private Date update;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
