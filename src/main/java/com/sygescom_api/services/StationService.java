package com.sygescom_api.services;

import com.sygescom_api.dto.StationDTO;
import com.sygescom_api.dto.ZoneDTO;

import java.util.List;

public interface StationService {
    StationDTO create(StationDTO dto);
    StationDTO findById(Integer id);
    List<StationDTO> findAll();
    void delete(Integer id);
}
