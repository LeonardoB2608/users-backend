package com.springboot.usersapp.usersbackend.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.springboot.usersapp.usersbackend.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

    Page<User> findAll(Pageable pageable);

    Optional<User> findByUsername(String name);
}
