package com.cms.example.cms.feature.geo.divsionService;

import com.cms.example.cms.entities.Division;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DivisionService {

    private final DivisionRepository divisionRepository;

    public Optional<Division> getDivisionById(Long divisionId) {
        return divisionRepository.findById(divisionId);
    }
    public Optional<Division> getDivisionDetailsById(Long divisionId) {
        return divisionRepository.findByIdWithDetails(divisionId);
    }
}