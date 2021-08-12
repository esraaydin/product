package com.project.product.controller;

import java.util.List;

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

    private static final ProductOrder ProductOrder = null;
    @Autowired
    ProductOrderService productOrderService;

    @GetMapping("/productOrder")
    private List<ProductOrder> getAllproductOrder(){
        return productOrderService.getAllProductOrder();
    }

    @GetMapping("/productOrder/{id}")

    private ProductOrder getproductOrder(@PathVariable long id){
        return productOrderService.getproductOrderByıd(id);

    }

    @PostMapping("/productOrder")

    private ProductOrder saverOrUpdate(@RequestBody ProductOrder productOrder){
        return productOrderService.createproductOrder(productOrder);

    }
    @DeleteMapping("/productOrder/{id}")
    private void deleteproductOrder(@PathVariable Long id){

        productOrderService.deleteproductOrder(id);
    }

    @PutMapping(value="/productOrder")
    private ProductOrder updateProductOrder(@RequestBody ProductOrder productOrder){
        return productOrderService.updateProductOrder(productOrder);
    }
    
}
