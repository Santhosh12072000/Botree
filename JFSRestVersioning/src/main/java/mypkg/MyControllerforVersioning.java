package mypkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControllerforVersioning {
      
	@GetMapping("v1/user")
	public User createUser(){
		return new User("Mithra Joshvi");
	}
	@GetMapping("v2/user")
	public UserV2 createUserV2(){
		UserName name=new UserName("Mithra"," Joshvi");
		UserV2 obj2= new UserV2(name);
		return obj2;
	}
}
