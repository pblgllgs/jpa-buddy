package com.pblgllgs.jpabuddy.dao;

import com.pblgllgs.jpabuddy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}