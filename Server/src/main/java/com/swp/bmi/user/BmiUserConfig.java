package com.swp.bmi.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class BmiUserConfig {

    @Bean
    CommandLineRunner commandLineRunner(BmiUserRepository repository) {
        return args -> {
            BmiUser bjoern = new BmiUser(

                    "bjoern",
                    "bjoern@test.de",
                    LocalDate.of(2000, 01, 01),
                    165,
                    55
            );

            BmiUser sina = new BmiUser(

                    "sina",
                    "sina@test.de",
                    LocalDate.of(1990, 01, 01),
                    165,
                    55
            );

            repository.saveAll(
                    List.of(bjoern, sina)
            );
        };
    }
}
