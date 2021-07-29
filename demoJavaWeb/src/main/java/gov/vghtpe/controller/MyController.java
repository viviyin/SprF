package gov.vghtpe.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gov.vghtpe.model.User;

@RestController
public class MyController {
	
	@RequestMapping(value="/getUser",method=RequestMethod.GET)
	public ResponseEntity<?> hello(){
		User u = new User(1, "Sparrow", 30, 500000);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
	
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	public String greet(){
	
		return "Hello Spring Boot";
	}
}
