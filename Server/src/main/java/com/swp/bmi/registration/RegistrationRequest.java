package com.swp.bmi.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String name;
    private final String username;
    private final String eMail;
    private final String password;
    private final LocalDate dob;
    private final Integer weight;
    private final Integer height;

}
