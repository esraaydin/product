package com.project.product.service;

import java.util.List;

import javax.persistence.criteria.Order;
import com.project.product.entity.ProductOrder;
import com.project.product.repository.ProductOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductOrderService {

    @Autowired
    ProductOrderRepository productOrderRepository;

    public List<ProductOrder> getAllOrders() {
        return productOrderRepository.findAll();
    }

    public ProductOrder getOrderByıd(long id) {
        return productOrderRepository.findById(id).get();
    }

    public ProductOrder saveOrUpdate(Order order){
        return (ProductOrder) productOrderRepository.save(order);
    }

    public ProductOrder createOrder(Order order) {
        return saveOrUpdate(order);
    }

    public void deleteOrder(Long id) {
        productOrderRepository.deleteById(id);
    }

    public Order updateOrder(Order order) {
        return productOrderRepository.save(order);
    }
    
}
