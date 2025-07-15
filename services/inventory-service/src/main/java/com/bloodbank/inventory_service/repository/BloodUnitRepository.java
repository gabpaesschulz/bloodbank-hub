package com.bloodbank.inventory_service.repository;

import com.bloodbank.inventory_service.domain.BloodUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface BloodUnitRepository extends JpaRepository<BloodUnit, Long> {
    @Query("select b from BloodUnit b where b.status = 'AVAILABLE' and b.expiresAt <= :limit")
    List<BloodUnit> findCritical(@Param("limit") LocalDate limit);
}
