package ua.unifi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.unifi.entity.AdressEntity;
import ua.unifi.repository.AdressRepository;
import ua.unifi.service.AdressService;

@Service
public class AdressServiceImpl implements AdressService{

	@Autowired
	private AdressRepository adressRepository;
	
	@Override
	public void saveAdress(AdressEntity adress) {
		adressRepository.save(adress);
		
	}

	@Override
	public AdressEntity findById(Long id) {
		return adressRepository.getOne(id);
	}

	@Override
	public List<AdressEntity> findAlladress() {
		return adressRepository.findAll();
	}

	
}
