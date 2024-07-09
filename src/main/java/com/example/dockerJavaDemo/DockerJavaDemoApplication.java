package com.example.dockerJavaDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.example.log4j2sample.Log4jSampleApplication;


@SpringBootApplication
@ComponentScan(basePackages = { "com.example" })
@EntityScan("com.example")   
@EnableJpaRepositories("com.example")
public class DockerJavaDemoApplication {
	//private static final Logger LOGGER = LoggerFactory.getLogger(DockerJavaDemoApplication.class);
	  private static final Logger logger = LogManager.getLogger(DockerJavaDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DockerJavaDemoApplication.class, args);
	}

}
