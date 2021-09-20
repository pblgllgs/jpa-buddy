package com.pblgllgs.jpabuddy.dao;

import com.pblgllgs.jpabuddy.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}