package com.example.company.DAO;

import java.util.List;
import java.util.Optional;


import com.example.company.entity.user;

public interface userDAO {

	public List<user> getUser();

	public user saveUser(user theUser);

	public Optional<user> getUser(int theId);

	public void deleteUser(int theId);

    user putUser(int id, user theUser);
}
