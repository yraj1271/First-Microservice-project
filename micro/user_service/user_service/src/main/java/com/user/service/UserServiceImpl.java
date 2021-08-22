package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    List<User> list= List.of(
            new User(1234L,"Yogesh","123432123"),
            new User(123L,"Rajesh","12343212"),
            new User(223L,"Yosh","1234321")
    );

    @Override
    public User getUser(Long id) {

        return list.stream().filter(user-> Objects.equals(user.getUserId(), id)).findAny().orElse(null);
    }
}
