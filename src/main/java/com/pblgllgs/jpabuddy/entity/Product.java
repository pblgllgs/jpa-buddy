package com.pblgllgs.jpabuddy.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "product")
@Entity
@Data
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "price")
    private Long price;

}