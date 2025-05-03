package com.schoolvaccination.mapper;

import org.springframework.stereotype.Component;

import com.schoolvaccination.dto.VaccineInfoDTO;
import com.schoolvaccination.model.VaccineInfo;

@Component
public class VaccineInfoMapper {

    public VaccineInfoDTO toDTO(VaccineInfo vaccineInfo) {
        if (vaccineInfo == null) {
            return null;
        }
        VaccineInfoDTO dto = new VaccineInfoDTO();
        dto.setVaccineId(vaccineInfo.getVaccineId());
        dto.setVaccineName(vaccineInfo.getVaccineName());
        dto.setVaccineInfo(vaccineInfo.getVaccineInfo());
        return dto;
    }

    public VaccineInfo toEntity(VaccineInfoDTO dto) {
        if (dto == null) {
            return null;
        }
        VaccineInfo entity = new VaccineInfo();
        entity.setVaccineId(dto.getVaccineId());
        entity.setVaccineName(dto.getVaccineName());
        entity.setVaccineInfo(dto.getVaccineInfo());
        return entity;
    }
}