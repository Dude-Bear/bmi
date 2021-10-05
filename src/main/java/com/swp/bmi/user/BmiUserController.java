package com.swp.bmi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class BmiUserController {

    private final BmiUserService bmiUserService;

    @Autowired
    public BmiUserController(BmiUserService bmiUserService) {
        this.bmiUserService = bmiUserService;
    }

    @GetMapping
    public List<BmiUser> getUser() {
        return bmiUserService.getUsers();
    }

    @PostMapping
    public void registerNewUser(@RequestBody BmiUser bmiUser){
        bmiUserService.addNewUser(bmiUser);
    }

    @DeleteMapping (path = "{userID}")
    public void deleteBmiUser (@PathVariable("userID") Long userId){
        bmiUserService.deleteUser(userId);
    }
}
