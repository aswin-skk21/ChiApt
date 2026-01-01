package com.y_aswin.ChiTownStudentApartments;

public class Apartments {
    private String id;
    private String name;
    private int rent;

    public Apartments() {
    }

    public Apartments(String id, String name, int rent) {
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
