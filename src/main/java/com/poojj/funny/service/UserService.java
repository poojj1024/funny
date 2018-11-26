package com.poojj.funny.service;

import com.poojj.funny.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {
    public String addUser(User user);
    public String login(User user);
}
