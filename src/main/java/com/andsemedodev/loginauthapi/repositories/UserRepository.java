package com.andsemedodev.loginauthapi.repositories;

import com.andsemedodev.loginauthapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
