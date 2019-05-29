package com.intive.fdv.rentbike.model;

public class Promotion {

    private Long id;
    private String name;
    private String description;
    private Double discount;
    private Integer min;
    private Integer max;

    public Promotion(Long id, String name, String description, Double discount, Integer min, Integer max) {
        this.name = name;
        this.description = description;
        this.discount = discount;
        this.min = min;
        this.max = max;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }
}
