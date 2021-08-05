package com.project.product.controller;

import java.util.List;

import com.project.product.entity.Product;
import com.project.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    
    @GetMapping("/product")
    private List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/product/{id}")

    private Product getProduct(@PathVariable Long id){
        return productService.getProductById(id);

    }

    @PostMapping("/product")

    private Product saveOrUpdate(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @DeleteMapping("/product/{id}")
    private void deleteProduct(@PathVariable Long id){

        productService.deleteProduct(id);

    }
    @PutMapping(value = "/product")
    private Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);


    }
}
