package com.intive.fdv.rentbike.model;

public class Rent {

    private Long id;
    private Double price;
    private RentType rentType;
    private Currency currency;

    public Rent(Long id, Double price, RentType rentType, Currency currency) {
        this.id = id;
        this.price = price;
        this.rentType = rentType;
        this.currency = currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
