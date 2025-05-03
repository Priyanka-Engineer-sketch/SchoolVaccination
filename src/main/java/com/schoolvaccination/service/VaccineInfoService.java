package com.schoolvaccination.service;

import java.util.List;

import com.schoolvaccination.model.VaccineInfo;


public interface VaccineInfoService {
	List<VaccineInfo> getAllVaccineInfo();

	VaccineInfo createVaccineInfo(VaccineInfo vaccineInfo);
}
