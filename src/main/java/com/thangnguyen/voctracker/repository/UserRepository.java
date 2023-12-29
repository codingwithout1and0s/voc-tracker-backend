package com.thangnguyen.voctracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thangnguyen.voctracker.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
