package com.y_aswin.ChiTownStudentApartments.Services;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
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
}
