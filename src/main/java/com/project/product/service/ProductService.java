package com.project.product.service;

import java.util.ArrayList;
import java.util.List;

import com.project.product.entity.Product;
import com.project.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository; 

    List<Product> getAllProduct;

    public List<Product> getAllProduct() {
        List<Product> product= new ArrayList<Product>();
        productRepository.findAll().forEach(product1 -> product.add(product1));
        return product;
    }    
}
