package com.defence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.defence.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.login = :login")
	User findUserByLogin(@Param("login") String login);
	
	@Query("SELECT u FROM User u WHERE LOWER(u.login) = :login OR LOWER(u.email) = :email")
	User findUserByEmailOrLogin(@Param("login") String login, @Param("email") String email);
	
	
	
}
