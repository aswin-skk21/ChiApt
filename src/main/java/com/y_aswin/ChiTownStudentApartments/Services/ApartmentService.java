package com.y_aswin.ChiTownStudentApartments.Services;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import com.y_aswin.ChiTownStudentApartments.Repositories.ApartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {

        this.apartmentRepository = apartmentRepository;
    }

    public List<Apartment> getAllApartments() {

        return apartmentRepository.findAll();
    }

    public void insertApartment(Apartment apt) {

        apartmentRepository.save(apt);
    }

    public List<College> getApartmentByCollege(Integer id) {
        return apartmentRepository.getApartmentsById(id);
    }

    public List<Apartment> filterApartments(Integer collegeId, Integer bathrooms, Integer bedrooms,
                                            Integer priceMin, Integer priceMax) {
        return apartmentRepository.findWithFilters(collegeId, bathrooms, bedrooms, priceMin, priceMax);
    }
}
