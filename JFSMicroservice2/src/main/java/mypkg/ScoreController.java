package mypkg;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ScoreController {
	@GetMapping("/score")
	public String Score()
	{
	    return("Welcome to Scorepage");
    }
//	@GetMapping("/scoreboard")
//	public String Scoreboard()
//	{String a,b,c;
//	a="Welcome to Scoreboardpage";
//	b="Santhosh-100";
//	c="Gautam-53";
//	    return(a	+b	+c);
//	}
	    
	    
			
			@Bean
			@LoadBalanced
			public RestTemplate createRestTemplate() {
				
				return new RestTemplate();
				
			}

	    
	    
	    
	    
    }
//	@GetMapping("/scoreboard")
//	public String Scoreboard()
//	{
//	    return["Welcome to Scoreboardpage","Santhosh-100","Gautam-53","surrender-57"];
//    }

	

