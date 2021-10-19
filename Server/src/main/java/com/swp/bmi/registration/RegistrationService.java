package com.swp.bmi.registration;

import com.swp.bmi.user.AppUserRole;
import com.swp.bmi.user.BmiUser;
import com.swp.bmi.user.BmiUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final BmiUserService bmiUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {

        boolean isValidEmail = emailValidator.test(request.getEMail());
        if(!isValidEmail){
            throw new IllegalStateException("email not valid");
        }
        return bmiUserService.signUpUser(
                new BmiUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEMail(),
                        request.getPassword(),
                        AppUserRole.USER,
                        request.getDob(),
                        request.getWeight(),
                        request.getHeight(),
                        request.getDateOfMeasurement()
                )
        );
    }
}
