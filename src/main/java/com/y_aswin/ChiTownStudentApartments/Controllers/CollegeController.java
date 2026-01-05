package com.y_aswin.ChiTownStudentApartments.Controllers;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import com.y_aswin.ChiTownStudentApartments.Services.ApartmentService;
import com.y_aswin.ChiTownStudentApartments.Services.CollegeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/college")
public class CollegeController {

    private final CollegeService collegeService;

    public CollegeController(CollegeService collegeService) {
        this.collegeService = collegeService;
    }

    @GetMapping
    public List<College> getColleges() {
        return collegeService.getAllColleges();

    }

    public void addNewCollege(College clg) {
        collegeService.insertCollege(clg);
    }
}
