package com.intive.fdv.rentbike.model;


import java.util.Objects;

public class Bike {

    private Long id;
    private String serial;

    public Bike(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(id, bike.id) &&
                Objects.equals(serial, bike.serial);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, serial);
    }
}
