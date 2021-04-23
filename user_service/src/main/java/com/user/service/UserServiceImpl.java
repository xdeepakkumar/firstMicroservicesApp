package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	
	//fake user List
	List<User> list = List.of(
			new User(123L, "Suraj Bhaiya", "9939377229"),
			new User(124L, "Vijay Bhaiya", "9199475413"),
			new User(125L, "Anil Bhaiya", "6200960560"),
			new User(126L, "Suraj Bhaiya", "8918146821")
	);

	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
