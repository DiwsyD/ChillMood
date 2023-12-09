package com.api.chillmood.service;

import com.api.chillmood.dto.UserDTO;
import com.api.chillmood.entity.User;
import com.api.chillmood.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User createUser(UserDTO newUser) {
        //TODO: Validate and convert dto to entity
        User nUser = new User();
        nUser.setName(newUser.getName());
        nUser.setGender(newUser.getGender());
        nUser.setDateOfBirth(newUser.getDateOfBirth());
        return userRepository.save(nUser);
    }
}
