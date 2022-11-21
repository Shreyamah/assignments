package com.assignments.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignments.bean.Customer;


@Repository
public interface CustomerRepository extends MongoRepository<Customer,Integer> {

}
