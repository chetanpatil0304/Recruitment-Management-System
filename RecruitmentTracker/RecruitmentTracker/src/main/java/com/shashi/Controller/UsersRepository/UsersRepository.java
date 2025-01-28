package com.shashi.Controller.UsersRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashi.Controller.Users.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	Users findByEmailAndPassword(String email, String password);
}
