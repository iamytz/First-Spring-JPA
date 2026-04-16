package com.ecommerce.jpa.entity;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentID;

    @Column(name = "Type_Payment")
    private String paymentType;

    @Column(name = "Status")
    private String paymentStatus;

    //CLASSIFICANDO SEUS RELACIONAMENTOS
    //2. 1 PAYMENT -> 1 ORDER
    @OneToOne
    @JoinColumn(name = "orderID")
    private Order order;

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
