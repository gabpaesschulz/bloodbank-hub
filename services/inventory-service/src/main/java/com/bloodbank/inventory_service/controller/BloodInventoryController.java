package com.bloodbank.inventory_service.controller;

import com.bloodbank.inventory_service.repository.BloodUnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class BloodInventoryController {

    private final BloodUnitRepository bloodUnitRepository;

    @GetMapping("/critical")
    public Object getCritical() {
        return bloodUnitRepository.findCritical(LocalDate.now().plusDays(3));
    }
}
