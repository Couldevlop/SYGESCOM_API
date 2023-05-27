package com.sygescom_api.services.Impl;

import com.sygescom_api.dto.RoleDTO;
import com.sygescom_api.services.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RoleServiceImpl implements RoleService {
    @Override
    public RoleDTO create(RoleDTO dto) {
        return null;
    }

    @Override
    public RoleDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<RoleDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
