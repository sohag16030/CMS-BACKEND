package com.cms.example.cms.feature.geo;

import com.cms.example.cms.entities.District;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

    @Query("SELECT d FROM District d LEFT JOIN FETCH d.upazilas LEFT JOIN FETCH d.division WHERE d.districtId = :districtId")
    Optional<District> findByIdWithDetails(@Param("districtId") Long districtId);

    @Query("SELECT d FROM District d LEFT JOIN FETCH d.upazilas WHERE d.districtId IN :districtsIds")
    List<District> fetchUpazilaByDistrictIdIn(@Param("districtsIds") List<Long> districtsIds);

    @Query(value = "SELECT DISTINCT dis FROM District dis " +
            "JOIN FETCH dis.division div " +
            "WHERE " +
            "(:districtId IS NULL OR dis.districtId = :districtId) AND " +
            "(:name IS NULL OR LOWER(dis.name) LIKE LOWER(CONCAT('%', :name, '%'))) AND " +
            "(:active IS NULL OR dis.active = :active) AND " +
            "(:divisionId IS NULL OR div.divisionId = :divisionId)",
            countQuery = "SELECT COUNT(dis) FROM District dis")
    Page<District> search(@Param("divisionId") Long divisionId,
                          @Param("districtId") Long districtId,
                          @Param("name") String name,
                          @Param("active") Boolean active, Pageable pageable);
}

