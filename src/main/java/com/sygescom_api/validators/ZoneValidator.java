package com.sygescom_api.validators;

import com.sygescom_api.dto.ZoneDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ZoneValidator {
    public static List<String> validate(ZoneDTO dto){
        List<String>errors = new ArrayList<>();
        if(dto == null){
            errors.add("Veillez renseigner le nom de la zone");
            errors.add("Veillé renseigner la description de la zone");
        }if(!StringUtils.hasLength(dto.getNom())){
            errors.add("Veillez renseigner le nom de la zone");
        }if(!StringUtils.hasLength(dto.getDescription())){
            errors.add("Veillé renseigner la description de la zone");
        }

        return errors;
    }
}
