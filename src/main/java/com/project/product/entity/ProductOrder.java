package com.project.product.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.criteria.Order;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
    @Table(name="productOrder")
    public class ProductOrder {
    
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long orderId;
    
        @Column(name="code", length = 64 ,nullable = false)
        private String code;
    
        @Column(name="active", nullable = false)
        private Boolean active;
    
        @Column(name="amount", nullable = false)
        private Integer amount;
    
        @Column(name = "totalPrice", nullable = false)
        private Long totalPrice;
    
        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "dd-MM-yyyy")
        Date deliveryDate;
        
        @Temporal(TemporalType.TIMESTAMP)
        @JsonFormat(pattern = "dd-MM-yyyy")
        Date orderDate;

        
        @ManyToOne
        @JoinColumn(name = "product_id")
        private Product product;

        
        public ProductOrder() {
        }
    
        public ProductOrder(Long orderId, String code, Boolean active, Integer amount, Long totalPrice, Date deliveryDate,
                Date orderDate, Product product) {
            this.orderId = orderId;
            this.code = code;
            this.active = active;
            this.amount = amount;
            this.totalPrice = totalPrice;
            this.deliveryDate = deliveryDate;
            this.orderDate = orderDate;
            this.product = product;
        }
    
        public Long getOrderId() {
            return orderId;
        }
    
        public void setOrderId(Long orderId) {
            this.orderId = orderId;
        }
    
        public String getCode() {
            return code;
        }
    
        public void setCode(String code) {
            this.code = code;
        }
    
        public Boolean getActive() {
            return active;
        }
    
        public void setActive(Boolean active) {
            this.active = active;
        }
    
        public Integer getAmount() {
            return amount;
        }
    
        public void setAmount(Integer amount) {
            this.amount = amount;
        }
    
        public Long getTotalPrice() {
            return totalPrice;
        }
    
        public void setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
        }
    
        public Date getDeliveryDate() {
            return deliveryDate;
        }
    
        public void setDeliveryDate(Date deliveryDate) {
            this.deliveryDate = deliveryDate;
        }
    
        public Date getOrderDate() {
            return orderDate;
        }
    
        public void setOrderDate(Date orderDate) {
            this.orderDate = orderDate;
        }
    
        public Product getproduct() {
            return product;
        }
    
        public void setproduct(Product product) {
            this.product = product;
        }

        public static ProductOrder updateOrder(Order order) {
            return null;
        }
    
    }