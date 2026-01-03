package com.y_aswin.ChiTownStudentApartments;

public class Apartment {
    private String id;
    private String name;
    private int rent;

    public Apartment() {
    }

    public Apartment(String id, String name, int rent) {
        this.id = id;
        this.name = name;
        this.rent = rent;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getRent() {
        return this.rent;
    }

}
