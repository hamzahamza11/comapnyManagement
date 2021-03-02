package com.example.company.service;

import java.util.List;
import java.util.Optional;

import com.example.company.DAO.userRepository;
import com.example.company.DAO.userDAO;
import com.example.company.entity.user;


public class userService implements userDAO{

private userRepository repository;
	
	public userService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<user> getUser() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public user saveUser(user theUser) {
		// TODO Auto-generated method stub
		return repository.save(theUser);

	}

	@Override
	public Optional<user> getUser(int theId) {
		// TODO Auto-generated method stub
		return repository.findById(theId);
	}

	@Override
	public void deleteUser(int theId) {
		// TODO Auto-generated method stub
		repository.deleteById(theId);

	}

	@Override
	public user putUser(int id,user theUser) {
		// TODO Auto-generated method stub
		user userToUpdate = repository.getOne(id);
		userToUpdate = theUser;
		return repository.save(userToUpdate);
	}
}
