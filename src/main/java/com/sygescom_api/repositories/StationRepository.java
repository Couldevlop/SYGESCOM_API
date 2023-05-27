package com.sygescom_api.repositories;

import com.sygescom_api.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Integer> {
}
