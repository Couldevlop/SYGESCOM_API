package com.sygescom_api.models;

import com.sygescom_api.models.parametrages.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "api_station")
@Entity
@Data
public class Station extends AbstractEntity{
 private String nom;
}
