package com.sygescom_api.models;

import com.sygescom_api.models.parametrages.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Api_prestataire")
public class Prestataire extends AbstractEntity {
    @Column(name = "nom")
    private String nom;

    @Column(name = "nomchauffeur")
    private String nomChauffeur;
}
