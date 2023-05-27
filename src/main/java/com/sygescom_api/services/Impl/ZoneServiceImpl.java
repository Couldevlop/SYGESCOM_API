package com.sygescom_api.services.Impl;

import com.sygescom_api.dto.ZoneDTO;
import com.sygescom_api.services.ZoneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ZoneServiceImpl implements ZoneService {
    @Override
    public ZoneDTO create(ZoneDTO dto) {
        return null;
    }

    @Override
    public ZoneDTO findById(Integer id) {
        return null;
    }

    @Override
    public List<ZoneDTO> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
