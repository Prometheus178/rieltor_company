package com.house.entities;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "HouseInNewComplex")
public class HouseInNewComplex {
    @Id
    @Column(name = "idHouse")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHouse;
    private String nameOfComplex;
    private String nameOfHouse;
    private int floor;
    private int apartment;
    private double square;
    private int price;
    private int fullPrice;
    private Status status;

    public HouseInNewComplex() {
    }

    public HouseInNewComplex(String nameOfComplex, String nameOfHouse, int floor, int apartment, double square, int price, int fullPrice, Status status) {
        this.nameOfComplex = nameOfComplex;
        this.nameOfHouse = nameOfHouse;
        this.floor = floor;
        this.apartment = apartment;
        this.square = square;
        this.price = price;
        this.fullPrice = fullPrice;
        this.status = status;
    }

    public int getIdHouse() {
        return idHouse;
    }

    public void setIdHouse(int idHouse) {
        this.idHouse = idHouse;
    }

    public String getNameOfComplex() {
        return nameOfComplex;
    }

    public void setNameOfComplex(String nameOfComplex) {
        this.nameOfComplex = nameOfComplex;
    }

    public String getNameOfHouse() {
        return nameOfHouse;
    }

    public void setNameOfHouse(String nameOfHouse) {
        this.nameOfHouse = nameOfHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HouseInNewComplex{" +
                "idHouse=" + idHouse +
                ", nameOfComplex='" + nameOfComplex + '\'' +
                ", nameOfHouse='" + nameOfHouse + '\'' +
                ", floor=" + floor +
                ", apartment=" + apartment +
                ", square=" + square +
                ", price=" + price +
                ", fullPrice=" + fullPrice +
                ", status=" + status +
                '}';
    }
}
