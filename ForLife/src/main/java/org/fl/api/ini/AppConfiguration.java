package org.fl.api.ini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("org.fl.api")
public class AppConfiguration {
	public static void main(String[] args) {
		SpringApplication.run(AppConfiguration.class, args);
	}

}
