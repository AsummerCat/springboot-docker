package com.linjingc.dockerdemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemo2Application.class, args);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "<h1>Hello Spring-Boot Maven Docker2</h1>";
	}
}
