package com.nschlimm.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsrefDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsrefDiscoveryApplication.class, args);
	}

}
