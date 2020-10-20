package com.mgl.digital.sds.scrapper.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mgl.digital.sds.scrapper.app")
public class AccenturePsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccenturePsApplication.class, args);
	}

}
