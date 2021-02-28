package ru.isaev.springsecuritydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.isaev.springsecuritydemo.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
