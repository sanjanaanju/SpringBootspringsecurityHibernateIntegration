package com.developerstack.dao;

import java.util.List;

import com.developerstack.model.UserDetails;

public interface UserDao {
	
	List<UserDetails> getUserDetails();
	UserDetails findUserByEmail(String name);

}
