package com.paramjot.amigoscoderestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan(basePackages = "com.paramjot.amigoscoderestapi")
@EnableAutoConfiguration
@RestController
public class AmigoscodeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmigoscodeRestApiApplication.class, args);
	}

}
