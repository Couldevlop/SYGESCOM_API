package com.sygescom_api.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ZoneDTO {
    private Integer id;
    private String nom;
    private String description;
    private String localisation;
}
