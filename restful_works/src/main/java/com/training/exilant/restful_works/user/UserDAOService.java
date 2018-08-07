package com.training.exilant.restful_works.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {

	
	private static List<User> users=new ArrayList<>();
	private static int usersCount=103;
  static{
	users.add(new User(101,"Rama",new Date()));  
	users.add(new User(102,"Teja",new Date()));  
	users.add(new User(103,"Pooja",new Date()));  
	users.add(new User(104,"Kavitha",new Date()));  
	users.add(new User(105,"Bhawana",new Date()));  
  }
	public List<User> getAllUsers(){
		return users;
		
	}
	public User saveUser(User user) {
		
		if(user.getUserId()==null) {
			user.setUserId(++usersCount);
		}
		users.add(user);
		return user;
		}

public User getUser(int userId) {
	for(User user:users) {
		if(user.getUserId()==userId) {
			return user;
		}
	}
	return null;
}
public User deleteUser(int userId) {
	
	for(User user:users) {
		if(user.getUserId()==userId) {
			users.remove(user);
			return user;
			
		}
	}
	
	
	return null;
}
public User updateUser(User user) {
	
	if(user.getUserId()==null) {
		user.setUserId(++usersCount);
	     }
	users.add(user);
	return user;
	
     }
}
