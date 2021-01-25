package com.sharp.crm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharp.crm.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
