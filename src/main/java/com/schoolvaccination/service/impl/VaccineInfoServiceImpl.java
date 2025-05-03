package com.schoolvaccination.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.schoolvaccination.model.VaccineInfo;
import com.schoolvaccination.service.VaccineInfoService;
import com.vaccination.repository.VaccineInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class VaccineInfoServiceImpl implements VaccineInfoService {
	
	
	 @Autowired
	    private VaccineInfoRepository vaccineInfoRepository;

	    @Override
	    public List<VaccineInfo> getAllVaccineInfo() {
	        log.info("Fetching all vaccine info records");
	        return vaccineInfoRepository.findAll();
	    }

	    @Override
	    public VaccineInfo createVaccineInfo(VaccineInfo vaccineInfo) {
	        log.info("Saving new vaccine info record: {}", vaccineInfo);
	        return vaccineInfoRepository.save(vaccineInfo);
	    }
}
