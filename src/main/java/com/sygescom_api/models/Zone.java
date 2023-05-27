package com.sygescom_api.models;
import com.sygescom_api.models.parametrages.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "api_zone")
@Entity
public class Zone extends AbstractEntity {
    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    @Column(name="localisation")
    private String localisation;
}
