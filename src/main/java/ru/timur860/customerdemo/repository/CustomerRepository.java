package ru.timur860.customerdemo.repository;

/*
    repository interface, methods : find all...
 */

import org.springframework.data.jpa.repository.JpaRepository;
import ru.timur860.customerdemo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}