package com.login.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.login.user.dao.AppUserDAO;
import com.login.user.formBean.AppUserForm;
import com.login.user.helper.PasswordEncAndDec;
import com.login.user.model.AppUser;
import com.login.user.model.Gender;

@Service("appUserService")
public class AppUserService {

	 @Autowired
	 AppUserDAO appUserDAO;
	 // Config in WebSecurityConfig
    @Autowired
    private PasswordEncAndDec passwordEncoder;
 
    private static final Map<Long, AppUser> USERS_MAP = new HashMap<>();
 
//    static {
//        initDATA();
//    }
// 
//    private static void initDATA() {
//        String encrytedPassword = "";
// 
//        AppUser tom = new AppUser(1L, "tom", "Tom", "Tom", //
//                true, Gender.MALE, "tom@waltdisney.com", encrytedPassword, "US");
// 
//        AppUser jerry = new AppUser(2L, "jerry", "Jerry", "Jerry", //
//                true, Gender.MALE, "jerry@waltdisney.com", encrytedPassword, "US");
// 
//        USERS_MAP.put(tom.getUserId(), tom);
//        USERS_MAP.put(jerry.getUserId(), jerry);
//    }
 
    public Long getMaxUserId() {
        long max = 0;
        for (Long id : USERS_MAP.keySet()) {
            if (id > max) {
                max = id;
            }
        }
        return max;
    }
 
    //
 
    public AppUser findAppUserByUserName(String userName) {
     Collection<AppUser> appUsers = appUserDAO.findAll();

        for (AppUser u : appUsers) {
        	System.out.println("user names::::"+u.getUserName());
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        return null;
    }
 
    public AppUser findAppUserByEmail(String email) {
        Collection<AppUser> appUsers =appUserDAO.findAll();
        for (AppUser u : appUsers) {
         	System.out.println("user mail:::::::"+u.getEmail());
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
 
    public List<AppUser> getAppUsers() {
        List<AppUser> list = new ArrayList<>();
 
        list.addAll(appUserDAO.findAll());
        return list;
    }
 
    public AppUser createAppUser(AppUserForm form) {
        Long userId = this.getMaxUserId() + 1;
        String encrytedPassword = this.passwordEncoder.passwordEncoder(form.getPassword());
       
        AppUser user = new AppUser(userId, form.getUserName(), //
                form.getFirstName(), form.getLastName(), false, //
                form.getGender(), form.getEmail(), form.getCountryCode(), //
                encrytedPassword,form.getLanguage());
        appUserDAO.save(user);
 
        USERS_MAP.put(userId, user);
        return user;
    }
 

	
}
