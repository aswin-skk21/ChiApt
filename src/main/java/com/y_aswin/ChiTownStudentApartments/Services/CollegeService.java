package com.y_aswin.ChiTownStudentApartments.Services;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    private final CollegeService collegeService;


    public CollegeService(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    public List<College> getAllColleges() {
        return null;
    }

    public void insertApartment(Apartment apt) {
    }

    public void insertCollege(College clg) {
    }
}
