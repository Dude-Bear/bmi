package com.swp.bmi;

import com.swp.bmi.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class BmiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmiApplication.class, args);
    }

    @GetMapping
    public List<User> hello() {
        return List.of(
                new User(
                        1L,
                        "test",
                        "test@test.test",
                        LocalDate.of(2000, 01, 01),
                        21,
                        165,
                        55
                )
        );
    }

}
