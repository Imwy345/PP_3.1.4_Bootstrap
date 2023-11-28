package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
