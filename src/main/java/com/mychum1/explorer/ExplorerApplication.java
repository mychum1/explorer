package com.mychum1.explorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
@EnableHystrix
public class ExplorerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExplorerApplication.class, args);
	}

}
