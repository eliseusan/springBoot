package com.springinicio.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springinicio.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
