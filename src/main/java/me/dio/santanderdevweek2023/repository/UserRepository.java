package me.dio.santanderdevweek2023.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santanderdevweek2023.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
