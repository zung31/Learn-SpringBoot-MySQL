package com.in28min.LearnMySQLDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
@ComponentScan("com.in28min.LearnMySQLDocker.courses")
@Configuration
@EnableJpaRepositories(basePackages = "com.in28min.LearnMySQLDocker.courses.repository")
public class LearnMySqlDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnMySqlDockerApplication.class, args);
	}

}
