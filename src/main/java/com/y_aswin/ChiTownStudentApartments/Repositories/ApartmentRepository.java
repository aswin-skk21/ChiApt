package com.y_aswin.ChiTownStudentApartments.Repositories;

import com.y_aswin.ChiTownStudentApartments.Entities.Apartment;
import com.y_aswin.ChiTownStudentApartments.Entities.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
    List<College> getApartmentsById(int id);

    @Query("SELECT a FROM Apartment a WHERE " +
            "(:collegeId IS NULL OR a.college.id = :collegeId) AND " +
            "(:bathrooms IS NULL OR a.bathrooms = :bathrooms) AND " +
            "(:bedrooms IS NULL OR a.bedrooms = :bedrooms) AND " +
            "(:priceMin IS NULL OR a.rent >= :priceMin) AND " +
            "(:priceMax IS NULL OR a.rent <= :priceMax)")
    List<Apartment> findWithFilters(@Param("collegeId") Integer collegeId,
                                    @Param("bathrooms") Integer bathrooms,
                                    @Param("bedrooms") Integer bedrooms,
                                    @Param("priceMin") Integer priceMin,
                                    @Param("priceMax") Integer priceMax);
}
