package com.pblgllgs.jpabuddy.dao;

import com.pblgllgs.jpabuddy.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}