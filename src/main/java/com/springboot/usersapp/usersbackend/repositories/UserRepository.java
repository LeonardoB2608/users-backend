package com.springboot.usersapp.usersbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.springboot.usersapp.usersbackend.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
