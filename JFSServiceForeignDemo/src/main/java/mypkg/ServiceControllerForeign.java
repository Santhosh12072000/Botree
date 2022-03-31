package mypkg;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
public class ServiceControllerForeign {
	
	@GetMapping("/name")
	public String getName() {
		return "santhosh";
	}
//	@GetMapping("/age")
//	public String getAge() {
//		return "21";
//	}
//	@GetMapping("/collge")
//	public String getName1() {
//		return "SRM";
//	}

}
