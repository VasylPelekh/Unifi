package ua.unifi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.unifi.entity.UserEntity;
import ua.unifi.repository.UserRepository;
import ua.unifi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void saveUser(UserEntity user) {
		userRepository.save(user);
	}

	@Override
	public UserEntity findById(Long id) {
		return userRepository.getOne(id);
	}

	@Override
	public List<UserEntity> findAllUser() {
		return userRepository.findAll();
	}

}
