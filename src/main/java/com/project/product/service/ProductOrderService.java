package com.project.product.service;

import java.util.List;

import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider;
import com.project.product.entity.ProductOrder;
import com.project.product.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductOrderService {

    @Autowired
    ProductOrderRepository productOrderRepository;

    
    public List<ProductOrder> getAllProductOrder() {
        return productOrderRepository.findAll();
    }

    public ProductOrder saveOrUpdate(ProductOrder productOrder){
        return (ProductOrder) productOrderRepository.save(productOrder);
    }

    public ProductOrder updateProductOrder(ProductOrder ProductOrder) {
        return productOrderRepository.save(ProductOrder);
    }

    public void deleteproductOrder(Long id) {
        productOrderRepository.deleteById(id);
    }

    public ProductOrder getproductOrderByıd(long id) {
        return productOrderRepository.findById(id).get();
    }

    public ProductOrder createproductOrder(ProductOrder productOrder) {
        return saveOrUpdate(productOrder);
    }

    }
