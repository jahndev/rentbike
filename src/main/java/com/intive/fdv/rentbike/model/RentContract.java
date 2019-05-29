package com.intive.fdv.rentbike.model;

import java.util.List;

public class RentContract {

    private Long id;
    private List<RentDatail> rentDatails;
    private Promotion promotion;

    public RentContract(Long id, List<RentDatail> rentDatails) {
        this.id = id;
        this.rentDatails = rentDatails;
    }

    public RentContract(List<RentDatail> rentDatails) {
        this.rentDatails = rentDatails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<RentDatail> getRentDatails() {
        return rentDatails;
    }

    public void setRentDatails(List<RentDatail> rentDatails) {
        this.rentDatails = rentDatails;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
}
