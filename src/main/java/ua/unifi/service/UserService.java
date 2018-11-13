package ua.unifi.service;

import java.util.List;

import ua.unifi.entity.UserEntity;

public interface UserService {

	void saveUser(UserEntity user);
	
	UserEntity findById(Long id);
	
	List<UserEntity> findAllUser();
}
