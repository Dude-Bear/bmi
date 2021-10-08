package com.swp.bmi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public void addNewUser(BmiUser bmiUser) {
        Optional<BmiUser> userOptional = bmiUserRepository.findBmiUserByEMail(bmiUser.geteMail());
        if (userOptional.isPresent()) {
            throw new IllegalStateException("email Taken");
        }
        bmiUserRepository.save(bmiUser);
    }

    public void deleteUser(Long userId) {
        boolean exists = bmiUserRepository.existsById(userId);
        if (!exists) {
            throw new IllegalStateException("User with id" + userId + "does not exists");
        } else {
            bmiUserRepository.deleteById(userId);
        }
    }

    @Transactional
    public void updateUser(Long userId, String name, String eMail, Integer weight, Integer height) {
        BmiUser user = bmiUserRepository.findById(userId)
                .orElseThrow(() -> new IllegalStateException("User with id" + userId + "does not exists"));
        if (name != null && name.length() > 0) {
            user.setName(name);
        }
        if (eMail != null && eMail.length() > 0) {
            Optional<BmiUser> userOptional = bmiUserRepository.findBmiUserByEMail(eMail);
            if (userOptional.isPresent()) {
                throw new IllegalStateException("email Taken");
            } else {
                user.seteMail(eMail);
            }
        }
        if (weight != null && weight > 0) {
            user.setWeight(weight);
        }
        if (height != null && height > 0) {
            user.setHeight(height);
        }

    }
}
