package com.thangnguyen.voctracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.thangnguyen.voctracker.config.RsaKeyProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class VocTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VocTrackerApplication.class, args);
	}

}
