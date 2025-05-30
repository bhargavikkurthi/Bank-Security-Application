package dev.bhargav.banksecurity.repository;

import dev.bhargav.banksecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
//    Derived Query to fetch User by username
}
