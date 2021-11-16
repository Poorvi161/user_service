package com.user.user_service.service;


import org.springframework.stereotype.Service;
import com.user.user_service.entity.User;
import java.util.List;
@Service
public  class UserServiceImpl implements UserService{
//creating fake user list else we have to take this from db

        List<com.user.user_service.entity.User> list = List.of(
                new User(1311L, "Poorvi", "11111111"),
                new User(1312L, "Blah", "111111444"),
                new User(1313L, "Joe", "11116611")
        );

    @Override
    public User getUser(Long id) {
        return (User) this.list.stream().filter(User-> {
            return User.getUserId().equals(id);
        }).findAny().orElse(null);
    }
}
