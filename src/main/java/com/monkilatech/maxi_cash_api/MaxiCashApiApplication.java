package com.monkilatech.maxi_cash_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MaxiCashApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MaxiCashApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MaxiCashApiApplication.class);
	}

}
