package com.springboot.usersapp.usersbackend.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.springboot.usersapp.usersbackend.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

    Optional<Role> findByName(String name);

}
