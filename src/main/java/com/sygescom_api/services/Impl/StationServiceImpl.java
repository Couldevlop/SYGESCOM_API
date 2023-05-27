package com.sygescom_api.services.Impl;

import com.sygescom_api.dto.StationDTO;
import com.sygescom_api.services.StationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StationServiceImpl implements StationService {
    @Override
    public StationDTO create(StationDTO dto) {
        return null;
    }

    @Override
    public StationDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<StationDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
