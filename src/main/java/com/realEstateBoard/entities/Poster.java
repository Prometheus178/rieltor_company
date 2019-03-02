package com.realEstateBoard.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Poster")

public class Poster {
    @Id
    @Column(name = "idPoster")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idPoster;
    private LocalDateTime dateTime;
    private AccountType accountType;
    private DealType dealType;
    private RentType rentType;
    private RealEstateType realEstateType;
    private Living living;
    private Commercial commercial;
    private String address;
    private BuildingType buildingType;
    private String description;
    private char photo;
    private int price;
    private int deposit;
    private CommunalPayments communalPayments;

    public Poster(AccountType accountType, DealType dealType, RentType rentType, RealEstateType realEstateType, Living living, Commercial commercial, String address, BuildingType buildingType, String description, char photo, int price, int deposit, CommunalPayments communalPayments) {
        dateTime = LocalDateTime.now();
        this.accountType = accountType;
        this.dealType = dealType;
        this.rentType = rentType;
        this.realEstateType = realEstateType;
        this.living = living;
        this.commercial = commercial;
        this.address = address;
        this.buildingType = buildingType;
        this.description = description;
        this.photo = photo;
        this.price = price;
        this.deposit = deposit;
        this.communalPayments = communalPayments;
    }

    public int getIdPoster() {
        return idPoster;
    }

    public void setIdPoster(int idPoster) {
        this.idPoster = idPoster;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public DealType getDealType() {
        return dealType;
    }

    public void setDealType(DealType dealType) {
        this.dealType = dealType;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    public Living getLiving() {
        return living;
    }

    public void setLiving(Living living) {
        this.living = living;
    }

    public Commercial getCommercial() {
        return commercial;
    }

    public void setCommercial(Commercial commercial) {
        this.commercial = commercial;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getPhoto() {
        return photo;
    }

    public void setPhoto(char photo) {
        this.photo = photo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "idPoster=" + idPoster +
                ", dateTime=" + dateTime +
                ", accountType=" + accountType +
                ", dealType=" + dealType +
                ", rentType=" + rentType +
                ", realEstateType=" + realEstateType +
                ", living=" + living +
                ", commercial=" + commercial +
                ", address='" + address + '\'' +
                ", buildingType=" + buildingType +
                ", description='" + description + '\'' +
                ", photo=" + photo +
                ", price=" + price +
                ", deposit=" + deposit +
                '}';
    }
}
