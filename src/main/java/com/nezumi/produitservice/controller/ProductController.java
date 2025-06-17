package com.nezumi.produitservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.nezumi.produitservice.model.Product;
import com.nezumi.produitservice.service.ProductService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
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

  @GetMapping("{id}")
  public @ResponseBody Product getProduct(@PathVariable Long id){
    return productService.getProduct(id);
  }

  @PutMapping("{id}")
  public @ResponseBody Product updateProduct(@PathVariable Long id, @RequestBody Product product){
    return productService.updateProduct(id, product);
  }

  @DeleteMapping("{id}")
  public String deleteProduct(@PathVariable Long id) {
    return productService.deleteProduct(id);
  }

}

