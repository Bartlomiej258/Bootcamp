package com.example.bootcamphibernate.invoice.dao;

import com.example.bootcamphibernate.invoice.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProductDao extends CrudRepository<Product, Integer> {

}
