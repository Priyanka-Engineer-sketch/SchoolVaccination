package com.schoolvaccination.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.schoolvaccination.api.VaccineInfoApi;
import com.schoolvaccination.dto.VaccineInfoDTO;
import com.schoolvaccination.mapper.VaccineInfoMapper;
import com.schoolvaccination.model.VaccineInfo;
import com.schoolvaccination.service.VaccineInfoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class VaccineInfoControllerImpl implements VaccineInfoApi {  

    @Autowired
    private VaccineInfoService vaccineInfoService;

    @Autowired
    private VaccineInfoMapper vaccineInfoMapper;

    @Override
    public List<VaccineInfoDTO> getAllVaccineInfo() {
        log.info("Controller: Getting all vaccine info");
        return vaccineInfoService.getAllVaccineInfo()
                .stream()
                .map(vaccineInfoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public VaccineInfoDTO createVaccineInfo(VaccineInfoDTO vaccineInfoDTO) {
        log.info("Controller: Creating new vaccine info with data: {}", vaccineInfoDTO);
        VaccineInfo entity = vaccineInfoMapper.toEntity(vaccineInfoDTO);
        VaccineInfo savedEntity = vaccineInfoService.createVaccineInfo(entity);
        return vaccineInfoMapper.toDTO(savedEntity);
    }
}