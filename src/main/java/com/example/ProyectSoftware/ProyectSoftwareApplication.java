package com.example.ProyectSoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.ProyectSoftware"})
public class ProyectSoftwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectSoftwareApplication.class, args);
	}

}
