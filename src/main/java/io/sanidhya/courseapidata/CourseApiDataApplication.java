package io.sanidhya.courseapidata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages={"io.sanidhya.courseapidata"})
public class CourseApiDataApplication {

	public static void main(String[] args) {

		SpringApplication.run(CourseApiDataApplication.class, args);
	}

}
