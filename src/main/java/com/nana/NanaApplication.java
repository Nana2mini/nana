package com.nana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NanaApplication.class, args);
	}

    @RequestMapping("/")
    public String toString() {
        return "Hello";
    }
}
