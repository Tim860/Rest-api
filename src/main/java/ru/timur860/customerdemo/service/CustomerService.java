package ru.timur860.customerdemo.service;

import ru.timur860.customerdemo.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();


}