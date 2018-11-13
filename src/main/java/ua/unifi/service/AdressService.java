package ua.unifi.service;

import java.util.List;

import ua.unifi.entity.AdressEntity;


public interface AdressService {

void saveAdress(AdressEntity adress);
	
	AdressEntity findById(Long id);
	
	List<AdressEntity> findAlladress();
}
