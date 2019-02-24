package com.customer.entities;

import com.house.entities.HouseInNewComplex;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @Column(name = "idCustomer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCustomer;
    private LocalDateTime dateTime;
    private String name;
    private String phoneNumber;
    private String email;
    private String comment;
    private boolean mortgage;
    private boolean agreeToDataProcessing;
    private int idHouse;
    public Customer(String name, String phoneNumber, String email, String comment, boolean mortgage, boolean agreeToDataProcessing, HouseInNewComplex houseInNewComplex) {
        dateTime = LocalDateTime.now();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.comment = comment;
        this.mortgage = mortgage;
        this.agreeToDataProcessing = agreeToDataProcessing;
        idHouse = houseInNewComplex.getIdHouse();
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isMortgage() {
        return mortgage;
    }

    public void setMortgage(boolean mortgage) {
        this.mortgage = mortgage;
    }

    public boolean isAgreeToDataProcessing() {
        return agreeToDataProcessing;
    }

    public void setAgreeToDataProcessing(boolean agreeToDataProcessing) {
        this.agreeToDataProcessing = agreeToDataProcessing;
    }
}
