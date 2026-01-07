package com.y_aswin.ChiTownStudentApartments.Controllers;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import com.y_aswin.ChiTownStudentApartments.Services.ApartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/apartment")
public class ApartmentController {

    private final ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @GetMapping
    public List<Apartment> getApartments() {
        return apartmentService.getAllApartments();

    }

    public void addNewApartment(Apartment apt) {
        apartmentService.insertApartment(apt);
    }

    public List<College> getApartmentByCollege(Integer id) {
        return apartmentService.getApartmentByCollege(id);
    }

}
