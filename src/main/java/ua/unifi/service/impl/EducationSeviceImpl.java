package ua.unifi.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.unifi.entity.EducationEntity;
import ua.unifi.repository.EducationRepository;
import ua.unifi.service.EducationService;

@Service
public class EducationSeviceImpl implements EducationService {

	private EducationRepository educationRepository;
	
	@Override
	public void saveEducation(EducationEntity education) {
		educationRepository.save(education);
		
	}

	@Override
	public EducationEntity findById(Long id) {
		return educationRepository.getOne(id);
	}

	@Override
	public List<EducationEntity> findAllEducation() {
		return educationRepository.findAll();
	}

	
}
