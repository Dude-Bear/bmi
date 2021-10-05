package com.swp.bmi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
    public void registerNewUser(@RequestBody BmiUser bmiUser) {
        bmiUserService.addNewUser(bmiUser);
    }

    @DeleteMapping(path = "{userID}")
    public void deleteBmiUser(
            @PathVariable("userID") Long userId) {
        bmiUserService.deleteUser(userId);
    }

    @PutMapping(path = "{userID}")
    public void updateBmiUser(
            @PathVariable("userID") Long userId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String eMail,
            @RequestParam(required = false) Integer weight,
            @RequestParam(required = false) Integer height
            ) {
        bmiUserService.updateUser(userId, name, eMail, weight, height);
    }
}
