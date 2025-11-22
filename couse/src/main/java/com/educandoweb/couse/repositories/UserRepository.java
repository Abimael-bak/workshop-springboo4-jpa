package com.educandoweb.couse.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.couse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
