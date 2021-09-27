package com.lld.rest.productcatalogservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lld.rest.productcatalogservice.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findAllByCategory(String category);
    public List<Product> findAllByProductName(String name);
}
