package com.project.product.repository;

import com.project.product.entity.ProductOrder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Long> {
    
}
