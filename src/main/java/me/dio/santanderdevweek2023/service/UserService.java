package me.dio.santanderdevweek2023.service;

import me.dio.santanderdevweek2023.model.User;
import me.dio.santanderdevweek2023.service.impl.UserServiceImpl;

public interface UserService  {

        User findById(long id);

       User create(User userToCreate);
    
}
