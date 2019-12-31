package com.nana;

import com.nana.modules.user.model.User;
import com.nana.modules.user.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@SpringBootApplication
public class NanaApplication {

    @Resource
    private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(NanaApplication.class, args);
	}

    @RequestMapping("/")
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }
}
