package com.swp.bmi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class BmiUserController {

    private final BmiUserService userService;

    @Autowired
    public BmiUserController(BmiUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<BmiUser> getUser() {
        return userService.getUsers();
    }
}
