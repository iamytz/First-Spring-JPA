//CLASSE DA TABELA CLIENTE
package com.ecommerce.jpa.entity;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerID;

    @Column(name = "Name", nullable = false)
    private String customerName;

    @Column(name = "Email", nullable = false)
    private String customerEmail;

    //CLASSIFICANDO SEUS RELACIONAMENTOS
    //1. CUSTOMER 1 -> N ORDER

    //@OneToMany(mappedBy = "Custommer_UUID")
    //private List<Order> orders;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;



    //OneToMany é o lado Espelhado, mapeia oque a outra classe procura (nome da variavel)
    //possui a lista de pedidos chamada order


    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
