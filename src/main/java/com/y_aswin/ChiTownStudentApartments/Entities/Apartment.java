package com.y_aswin.ChiTownStudentApartments.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int rent;
    private int bedrooms;
    private int bathrooms;
    private double distanceToCampus;
    private boolean isFurnished;
    private boolean hasInUnitLaundry;
    private boolean utilitiesIncluded;
    private boolean petFriendly;


    public Apartment() {
    }

    public Apartment(int rent, int id, String name, int bedrooms, int bathrooms, double distanceToCampus, boolean isFurnished, boolean hasInUnitLaundry, boolean utilitiesIncluded, boolean petFriendly) {
        this.rent = rent;
        this.id = id;
        this.name = name;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.distanceToCampus = distanceToCampus;
        this.isFurnished = isFurnished;
        this.hasInUnitLaundry = hasInUnitLaundry;
        this.utilitiesIncluded = utilitiesIncluded;
        this.petFriendly = petFriendly;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public double getDistanceToCampus() {
        return distanceToCampus;
    }

    public void setDistanceToCampus(double distanceToCampus) {
        this.distanceToCampus = distanceToCampus;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasInUnitLaundry() {
        return hasInUnitLaundry;
    }

    public void setHasInUnitLaundry(boolean hasInUnitLaundry) {
        this.hasInUnitLaundry = hasInUnitLaundry;
    }

    public boolean isUtilitiesIncluded() {
        return utilitiesIncluded;
    }

    public void setUtilitiesIncluded(boolean utilitiesIncluded) {
        this.utilitiesIncluded = utilitiesIncluded;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }
}

