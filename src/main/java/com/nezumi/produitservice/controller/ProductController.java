package com.nezumi.produitservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.nezumi.produitservice.model.Product;
import com.nezumi.produitservice.service.ProductService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/produits")
@RequiredArgsConstructor
public class ProductController {

  private final ProductService productService;
  
  @PostMapping("/add")
  public @ResponseBody Product addProduct(@RequestBody Product product) {
    return productService.addProduct(product);
  }

  @GetMapping("/all")
  public List<Product> getAllProduct(){
    return productService.getAllProduct();
  }
}

