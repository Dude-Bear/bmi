package com.swp.bmi.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BmiUserRepository
        extends JpaRepository<BmiUser, Long> {
}
