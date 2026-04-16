package com.ecommerce.jpa.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;

    @Column(name = "Data_Pedido")
    private LocalDateTime orderDate;

    @Column(name = "Order_Quantity")
    private int orderQtd;

    //CLASSIFICANDO SEUS RELACIONAMENTOS
    //1. ORDER N -> 1 CUSTOMER
    //Lado N de 1:n é quem manda
    //Entao o lado N que "Joina" no lado 1

    @ManyToOne
    @JoinColumn(name = "CostumerID")
    private Customer customer;


    //CLASSIFICANDO SEUS RELACIONAMENTOS
    //2. 1 ORDER -> 1 PAYMENT
    //Classe Payment que vai receber a FK
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;



    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderQtd() {
        return orderQtd;
    }

    public void setOrderQtd(int orderQtd) {
        this.orderQtd = orderQtd;
    }


}
