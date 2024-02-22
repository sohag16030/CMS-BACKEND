package com.cms.example.cms.feature.geo;

import com.cms.example.cms.entities.Upazila;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UpazilaRepository extends JpaRepository<Upazila, Long> {

    @Query("SELECT u FROM Upazila u LEFT JOIN FETCH u.district WHERE u.upazilaId = :upazilaId")
    Optional<Upazila> findByIdWithDetails(@Param("upazilaId") Long upazilaId);


    @Query("SELECT u FROM Upazila u " +
            "JOIN u.district dis " +
            "JOIN dis.division div " +
            "WHERE " +
            "(:upazilaId IS NULL OR u.upazilaId = :upazilaId) AND " +
            "(:name IS NULL OR LOWER(div.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
            "(:nameLocal IS NULL OR LOWER(div.nameLocal) LIKE LOWER(CONCAT('%', :nameLocal, '%'))) AND " +
            "(:active IS NULL OR u.active = :active) AND " +
            "(:districtId IS NULL OR dis.districtId = :districtId) AND " +
            "(:divisionId IS NULL OR div.divisionId = :divisionId)")
    List<Upazila> search(@Param("divisionId") Long divisionId,
                         @Param("districtId") Long districtId,
                         @Param("upazilaId") Long upazilaId,
                         @Param("name") String name,
                         @Param("nameLocal") String nameLocal,
                         @Param("active") Boolean active);

}

