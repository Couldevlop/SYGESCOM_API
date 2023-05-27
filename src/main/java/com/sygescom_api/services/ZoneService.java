package com.sygescom_api.services;

import com.sygescom_api.dto.ZoneDTO;

import java.util.List;

public interface ZoneService {
    ZoneDTO create(ZoneDTO dto);
    ZoneDTO findById(Integer id);
    List<ZoneDTO> findAll();
    void delete(Integer id);
}
