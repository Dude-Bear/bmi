package com.swp.bmi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BmiUserService {

    private final BmiUserRepository bmiUserRepository;

    @Autowired
    public BmiUserService(BmiUserRepository bmiUserRepository) {
        this.bmiUserRepository = bmiUserRepository;
    }

    public List<BmiUser> getUsers() {
        return bmiUserRepository.findAll();
    }
}
