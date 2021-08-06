package com.project.product.service;

import java.util.List;

import com.project.product.entity.Product;
import com.project.product.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository; 

    public List<Product> getAllProduct() {
        return productRepository.findAll();
        
    }    

    public Product getProductById(long id){

        return productRepository.findById(id).get();
    }

    public Product saveOrUpdate(Product product){

        return productRepository.save(product);
    }

    public Product createProduct(Product product) {
        return saveOrUpdate(product);
    }

    public void deleteProduct(long id){

        productRepository.deleteById(id);
    }

    public Product updateProduct(Product product){

        return productRepository.save(product);
    }
}


