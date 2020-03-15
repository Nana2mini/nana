package com.nana;

import com.nana.common.kafka.Producer;
import com.nana.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ServletComponentScan
@RestController
@SpringBootApplication
public class NanaApplication {
	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NanaApplication.class, args);

        Producer product = context.getBean(Producer.class);
        product.sendMessage("hello");


	}

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public void test(String[] args) {

        userService.getUserDAO();


    }
}
