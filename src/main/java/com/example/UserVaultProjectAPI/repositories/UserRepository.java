package com.example.UserVaultProjectAPI.repositories;

import com.example.UserVaultProjectAPI.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User>findByEmail(String email);
}
