package ru.timur860.customerdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.timur860.customerdemo.model.Customer;
import ru.timur860.customerdemo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiceImpl getById {}", id);
        return customerRepository.getOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete {}", id);
        customerRepository.deleteById(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }

//    @Override
//    public Customer update(Long id,Customer customer) {
//        Customer result = customerRepository.getOne(id);
//        result.setFirstName(customer.getFirstName());
//        result.setLastName(customer.getLastName());
//        result.setAddress(customer.getAddress());
//        result.setBudget(customer.getBudget());
//
//
//        return result;
//    }
}