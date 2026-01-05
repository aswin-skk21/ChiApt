package com.y_aswin.ChiTownStudentApartments.Repositories;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
}
