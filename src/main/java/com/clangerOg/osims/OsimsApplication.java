package com.clangerOg.osims;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OsimsApplication {

	public static void main(String[] args) {

		System.out.println("System has started.");

		SpringApplication.run(OsimsApplication.class, args);
	}

}
