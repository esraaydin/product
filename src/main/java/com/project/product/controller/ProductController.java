package com.project.product.controller;

import java.util.List;

import com.project.product.entity.Product;
import com.project.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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

    @GetMapping("/product/{productid}")

    private Product getProduct(@PathVariable("productid")long productid){
        return productService.getProductById(productid);

    }
    @DeleteMapping("/product/{productid}")
    private void deleteProduct(@PathVariable("productid")long productid){

        productService.delete(productid);

    }

    @PostMapping("/product")

    private long saveProduct(@RequestBody Product product){
        productService.saveOrUpdate(product);
        return product.getProductid();
    }

    @PutMapping("/product/{productid}")

    private Product update(@RequestBody Product product){
        productService.saveOrUpdate(product);
        return product;

    }
}
