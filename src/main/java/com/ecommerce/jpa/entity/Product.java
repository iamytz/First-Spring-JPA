package com.ecommerce.jpa.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productID;

    @Column(name = "Name")
    private String productName;

    @Column(name = "Price_Unity")

    //DEFININDO RELACIONAMENTO CARNIDALIDAEE ENTRE
    //CATEGORIA N:N PRODUTO

    @ManyToMany
    @JoinTable(name = "ProductCategory",
            joinColumns = @JoinColumn(name = "ProductID"),
            inverseJoinColumns = @JoinColumn(name = "CategoryID"))
            private List <Category> categories;




    private float productPrice;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }
}
