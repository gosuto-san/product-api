package com.nezumi.produitservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nezumi.produitservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}