package com.login.user.dao;
 
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;


import com.login.user.model.AppUser;

 @Transactional
public interface AppUserDAO extends MongoRepository<AppUser,String> {
 
	 AppUser findAppUserByEmail(String email);
	 AppUser findAppUserByUserName(String userName);
	 
	
	
   }