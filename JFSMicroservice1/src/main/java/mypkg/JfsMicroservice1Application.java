package mypkg;

import org.springframework.boot.SpringApplication;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;




@SpringBootApplication
@RestController
@EnableHystrix
public class JfsMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(JfsMicroservice1Application.class, args);
		
	}

	@RequestMapping(value="/")
	@HystrixCommand(fallbackMethod="fallback_hello",commandProperties= {
			@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="1000")

	})
	public String hello()throws InterruptedException{
		Thread.sleep(3000);
		return"Hystrix Fault Tolarence enabled";
	}
	private String fallback_hello()
	{
		return"It takes longer time than usual";
	}

}
