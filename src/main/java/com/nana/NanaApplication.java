package com.nana;

import com.nana.commom.kafka.Consumer;
import com.nana.commom.kafka.Producer;
import com.nana.commom.utils.Constants;
import com.nana.modules.user.model.User;
import com.nana.modules.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@SpringBootApplication
public class NanaApplication {
	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NanaApplication.class, args);

        Producer product = context.getBean(Producer.class);
        product.sendMessage("hello");


	}

    @RequestMapping("/")
    public void test(String[] args) {
    }
}
