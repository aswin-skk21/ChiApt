package com.y_aswin.ChiTownStudentApartments;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {

    @Id
    private String id;
    private String name;

    public College() {
    }

    public College(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
