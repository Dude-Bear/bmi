package com.swp.bmi.user;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BmiUserService implements UserDetailsService {

    private final static String USER_NOT_FOUND_MSG =
            "user mit email %s not found";

    private final BmiUserRepository bmiUserRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
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
            user.setFirstName(name);
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

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        return bmiUserRepository.findBmiUserByEMail(email).orElseThrow(() ->
                new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
    }

    public String signUpUser(BmiUser bmiUser){
        boolean userExists = bmiUserRepository.findBmiUserByEMail(bmiUser.geteMail())
                .isPresent();

        if (userExists){
            throw new IllegalStateException("email already exists");
        }

        String encodedPassword = bCryptPasswordEncoder.encode(bmiUser.getPassword());

        bmiUser.setPassword(encodedPassword);

        bmiUserRepository.save(bmiUser);

        /*todo: send confirmation token*/

        return "it works!";
    }

}
