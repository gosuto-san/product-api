package com.nezumi.produitservice.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.nezumi.produitservice.model.Product;
import com.nezumi.produitservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
  private final ProductRepository productRepository;

  public List<Product> getAllProduct() {
    return productRepository.findAll();
  }

  public Product addProduct(Product product) {
    return productRepository.save(product);
  }

  public Product getProduct(Long id) {
    Optional<Product> product = productRepository.findById(id);
    if (product.isEmpty()) {
      throw new RuntimeException("Produit inexistant !");
    }
    return product.get();
  }

  public Product updateProduct(Long id, Product product) {
    Optional<Product> productOptional = productRepository.findById(id);
    if (productOptional.isEmpty()) {
      throw new RuntimeException("Produit inexistant !");
    }
    Product productUpdated = Product.builder()
        .id(id)
        .name(product.getName())
        .price(product.getPrice())
        .build();
    return productRepository.save(productUpdated);
  }

  public String deleteProduct(Long id) {
    Optional<Product> productOptional = productRepository.findById(id);
    if (productOptional.isEmpty()) {
      throw new RuntimeException("Produit inexistant !");
    }
    productRepository.delete(productOptional.get());
    return "Produit supprime avec succes!";
  }

}
