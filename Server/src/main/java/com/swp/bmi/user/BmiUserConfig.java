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
                    "schriewer",
                    "bjoern@test.de",
                    "pw",
                    AppUserRole.USER,
                    LocalDate.of(2000, 01, 01),
                    165,
                    55
            );

            BmiUser sina = new BmiUser(

                    "sina",
                    "schriewer",
                    "sina@test.de",
                    "pw",
                    AppUserRole.USER,
                    LocalDate.of(2000, 01, 01),
                    165,
                    55
            );

            repository.saveAll(
                    List.of(bjoern, sina)
            );
        };
    }
}
