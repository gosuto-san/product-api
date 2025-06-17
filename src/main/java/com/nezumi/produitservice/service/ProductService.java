package com.nezumi.produitservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.nezumi.produitservice.model.Product;
import com.nezumi.produitservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
  private final ProductRepository productRepository;

  public List<Product> getAllProduct(){
    return productRepository.findAll();
  }

  public Product addProduct(Product product) {
    return productRepository.save(product);
  }
}
