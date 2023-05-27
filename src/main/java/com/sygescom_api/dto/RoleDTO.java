package com.sygescom_api.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDTO {
    private Integer id;
    private String nom;
    private String description;
}
