package com.intive.fdv.rentbike.model;

import java.sql.Date;

public class RentDatail {
    private Long id;
    private Bike bike;
    private Integer cuantity;
    private Date startDate;
    private Date endDate;
    private Date creationDate;
    private Date updateDate;
    private Rent rent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Integer getCuantity() {
        return cuantity;
    }

    public void setCuantity(Integer cuantity) {
        this.cuantity = cuantity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public RentDatail(Bike bike, Integer cuantity, Date startDate, Date endDate,
                      Date creationDate, Date updateDate, Rent rent) {
        this.bike = bike;
        this.cuantity = cuantity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.rent = rent;
    }
}
