package com.project.product.controller;

import java.util.List;

import com.project.product.entity.Product;
import com.project.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
