/*Data Access Layer*/
package com.swp.bmi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BmiUserRepository
        extends JpaRepository<BmiUser, Long> {

    @Query("select s from BmiUser s where s.eMail= ?1")
    Optional<BmiUser> findBmiUserByEMail(String email);
}
