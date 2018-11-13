package ua.unifi.service;

import java.util.List;

import ua.unifi.entity.EducationEntity;



public interface EducationService {

void saveEducation(EducationEntity education);
	
	EducationEntity findById(Long id);
	
	List<EducationEntity> findAllEducation();
}
