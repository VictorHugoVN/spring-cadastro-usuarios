package me.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
