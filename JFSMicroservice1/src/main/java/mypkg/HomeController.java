package mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("/home")
	public String home()
	{
		String product=restTemplate.getForObject("http://SCORE-MICROSERVICE/score",String.class);
	    return product;
		//return("Welcome to Homepage");
    }
//	public ModelAndView home() {
//		ModelAndView mv=new ModelAndView();
//		String score=restTemplate.getForObject("http://SCORE-MICROSERVICE/score",String.class);
//		mv.addObject("score",score);
//		mv.setViewName("home");
//		return mv;
//		
//	}

}
