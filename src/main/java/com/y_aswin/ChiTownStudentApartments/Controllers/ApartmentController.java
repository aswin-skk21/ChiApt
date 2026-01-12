package com.y_aswin.ChiTownStudentApartments.Controllers;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import com.y_aswin.ChiTownStudentApartments.Services.ApartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Apartment> getApartments(
            @RequestParam(required = false) Integer collegeId,
            @RequestParam(required = false) Integer bathrooms,
            @RequestParam(required = false) Integer bedrooms,
            @RequestParam(required = false) Integer priceMin,
            @RequestParam(required = false) Integer priceMax) {

        if (collegeId != null || bathrooms != null || bedrooms != null ||
                priceMin != null || priceMax != null) {
            return apartmentService.filterApartments(collegeId, bathrooms, bedrooms, priceMin, priceMax);
        }

        return apartmentService.getAllApartments();

    }

    public void addNewApartment(Apartment apt) {
        apartmentService.insertApartment(apt);
    }

    @GetMapping("/filter")
    public List<College> getApartmentByCollege(@RequestParam Integer id) {
        return apartmentService.getApartmentByCollege(id);
    }

}
