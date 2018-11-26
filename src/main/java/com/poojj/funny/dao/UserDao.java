package com.poojj.funny.dao;

import com.poojj.funny.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface UserDao extends JpaRepository<User, Long> {

    @Query(value = "select count(username) from User where username = :username")
    int findUsername(@Param("username") String username);

    @Query(value = "select count (username) from User where username = :username and password = :password")
    int login(@Param("username") String username,@Param("password") String password);
}
