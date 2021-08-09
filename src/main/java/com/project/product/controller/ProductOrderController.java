package com.project.product.controller;

import java.util.List;

import javax.persistence.criteria.Order;

import com.project.product.entity.ProductOrder;
import com.project.product.service.ProductOrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@Controller
public class ProductOrderController {

    @Autowired
    ProductOrderService orderService;

    @GetMapping("/order")
    private List<ProductOrder> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/order/{id}")

    private ProductOrder getOrder(@PathVariable long id){
        return orderService.getOrderByıd(id);

    }

    @PostMapping("/order")

    private ProductOrder saverOrUpdate(@RequestBody Order order){
        return orderService.createOrder(order);

    }
    @DeleteMapping("/order/{id}")
    private void deleteOrder(@PathVariable Long id){

        orderService.deleteOrder(id);
    }

    @PutMapping(value="/order")
    private ProductOrder updateOrder(@RequestBody Order order){
        return ProductOrder.updateOrder(order);
    }
    
}
