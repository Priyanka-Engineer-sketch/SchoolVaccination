package com.schoolvaccination.dto;

import lombok.Data;

@Data
public class VaccineInfoDTO {
    private Long vaccineId;
    private String vaccineName;
    private String vaccineInfo;
}