package com.y_aswin.ChiTownStudentApartments.Services;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import com.y_aswin.ChiTownStudentApartments.Repositories.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    private final CollegeRepository collegeRepository;

    public CollegeService(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    public List<College> getAllColleges() {
        return null;
    }

    public void insertApartment(Apartment apt) {
    }

    public void insertCollege(College clg) {
    }
}
