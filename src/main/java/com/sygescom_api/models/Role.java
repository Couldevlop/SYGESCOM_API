package com.sygescom_api.models;
import com.sygescom_api.models.parametrages.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "api_role")
@Entity
@Data
public class Role extends AbstractEntity {
    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;
}
