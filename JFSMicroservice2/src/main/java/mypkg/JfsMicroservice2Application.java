package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@SpringBootApplication
@RestController
@EnableHystrix
public class JfsMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(JfsMicroservice2Application.class, args);
	}

	@RequestMapping(value="/")
	@HystrixCommand(fallbackMethod="fallback_hello",commandProperties= {
			@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="10000")

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
