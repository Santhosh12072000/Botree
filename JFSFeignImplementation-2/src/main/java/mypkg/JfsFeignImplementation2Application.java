package mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class JfsFeignImplementation2Application {

	public static void main(String[] args) {
		SpringApplication.run(JfsFeignImplementation2Application.class, args);
	}

}
