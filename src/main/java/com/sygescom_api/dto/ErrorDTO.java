package com.sygescom_api.dto;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class ErrorDTO {
    private Integer httpCode;
    //private ErrorCodes code;
    private String message;
    private List<String> errors = new ArrayList<>();
}
