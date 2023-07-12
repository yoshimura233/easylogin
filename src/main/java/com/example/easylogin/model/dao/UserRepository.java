package com.example.easylogin.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.easylogin.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByUserNameAndPassword(String userName, String password);
}
