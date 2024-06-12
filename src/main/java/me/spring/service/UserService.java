package me.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.spring.model.User;
import me.spring.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User create(User userToCreate) {
		var userCreated = userRepository.save(userToCreate);
		return userCreated;
	}
	
	public List<User> findAll(){
		List<User> listUsers = userRepository.findAll();
		if(!listUsers.isEmpty()) {
			return listUsers;
		}
		return null;
	}
	
	public Optional<User> findById(Long id) {
		// Tratamento de Exceções
		return userRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		// Tratamento de Exceções
		userRepository.deleteById(id);
	}
	
	
	
}
