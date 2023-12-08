package tn.nuitinfo.nuitinfo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import tn.nuitinfo.nuitinfo.Models.Role;
import tn.nuitinfo.nuitinfo.Services.UserService;


@SpringBootApplication
public class NuitInfoApplication {
    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(NuitInfoApplication.class, args);
    }

    @PostConstruct
    void init_users() {

    }
    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }


}
