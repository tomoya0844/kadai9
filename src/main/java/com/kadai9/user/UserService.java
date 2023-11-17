package com.kadai9.user;

import com.kadai9.user.entity.User;
import com.kadai9.user.excepention.UserNotFoundException;
import com.kadai9.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findUser(int id) {
        Optional<User> user = this.userMapper.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else throw new UserNotFoundException("userID:" + id + "not found");
    }
}
