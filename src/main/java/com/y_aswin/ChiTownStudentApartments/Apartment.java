package com.y_aswin.ChiTownStudentApartments;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Apartment {

    @Id
    private int id;
    private String name;
    private int rent;

    public Apartment() {
    }

    public Apartment(int id, String name, int rent) {
        this.id = id;
        this.name = name;
        this.rent = rent;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getRent() {
        return this.rent;
    }

}
