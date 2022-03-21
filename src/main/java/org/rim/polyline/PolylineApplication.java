package org.rim.polyline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean; 

@SpringBootApplication
public class PolylineApplication {

	public static void main(String[] args) {
		SpringApplication.run(PolylineApplication.class, args);
	}
	
	
	@Bean
	public SpringApplicationContext springApplicationContext() {
		return new SpringApplicationContext();
	}

}
