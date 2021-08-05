package com.project.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;

    @Column(name="name", length = 64, nullable = false)
    private String name ;

    @Column(name="code", length = 18, nullable = false)
    private String code;

    @Column(name="active", nullable =false)
    private Boolean active;

    @Column(name="unitPrice", nullable = false)
    private Double unitPrice;

    public Product() {
    }
    

    public Product(Long id, String name, String code, Boolean active, Double unitPrice) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.active = active;
        this.unitPrice = unitPrice;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public long getProductid() {
        return 0;
    }
    
    
}
