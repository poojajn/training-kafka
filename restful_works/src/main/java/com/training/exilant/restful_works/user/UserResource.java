package com.training.exilant.restful_works.user;

import java.net.URI;
import java.util.List;


import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;



@RestController
public class UserResource {
   @Autowired
   private UserDAOService daoService;
   
   @GetMapping("/users")
   public List<User> getAllUsers(){
	   return daoService.getAllUsers();
   }
//   @GetMapping("/users/{userId}")
//   public User getOneUser(@PathVariable int userId){
//	   return daoService.getUser(userId);
//   }
   
   @PostMapping("/users")
   public void createUser(@RequestBody User user){
	   User saveUser=daoService.saveUser(user);
	   System.out.println("save User:::"+saveUser);
	   
   }
   @PostMapping("/usersv2")
   public ResponseEntity<Object> createUserResponsecode(@RequestBody User user){
	   User saveUser=daoService.saveUser(user);
	   
	   URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}").buildAndExpand(saveUser.getUserId()).toUri();
	   
	   return ResponseEntity.created(location).build();
	   
	   
   }
   @GetMapping("/delete/{userId}")
   public void deleteUser(@PathVariable int userId){
	   User saveUser=daoService.deleteUser(userId);
	   System.out.println("user deleted:::"+saveUser);
	   
   }
   @PostMapping("/update")
   public void Update(@RequestBody User user){
	   User saveUser=daoService.updateUser(user);
	   System.out.println("upaded User:::"+saveUser);
	   
   }
   
 @GetMapping("/userOne/{userId}")
   public User getOneUser(@PathVariable int userId){
	   
   User getUser=daoService.getUser(userId);
   if(getUser==null) {
	   throw new UserNotFoundException("Id::"+userId);
   }
   return getUser;
   }
   @GetMapping("/users/{userId}")
   public Resource<User> getOneUser2(@PathVariable int userId){
	   
	   User getUser=daoService.getUser(userId);
	   if(getUser==null) {
		   throw new UserNotFoundException("Id::"+userId);
	   }
	   
	   Resource<User> resource=new Resource<User>(getUser);
	   
	   ControllerLinkBuilder linkTo=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getAllUsers());
	   ControllerLinkBuilder linkTo1=new ControllerLinkBuilderFactory().linkTo(methodOn(this.getClass()).getOneUser(userId));
	   
	   resource.add(linkTo.withRel("all-users"));
	   resource.add(linkTo1.withRel("get-another-way"));
	   return resource;
   }
}
