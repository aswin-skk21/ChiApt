package com.y_aswin.ChiTownStudentApartments.Repositories;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
    List<College> getApartmentsById(int id);
}
