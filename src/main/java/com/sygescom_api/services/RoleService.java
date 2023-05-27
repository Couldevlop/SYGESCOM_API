package com.sygescom_api.services;

import com.sygescom_api.dto.RoleDTO;
import com.sygescom_api.dto.StationDTO;

import java.util.List;

public interface RoleService {
    RoleDTO create(RoleDTO dto);
    RoleDTO findById(Integer id);
    List<RoleDTO> findAll();
    void delete(Integer id);
}
