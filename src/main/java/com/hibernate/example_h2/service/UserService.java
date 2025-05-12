package com.hibernate.example_h2.service;

import com.hibernate.example_h2.dto.UserDTO;
import com.hibernate.example_h2.entity.User;
import com.hibernate.example_h2.repo.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public UserDTO getUser(String id) {
        User user =  userRepository.findById(Long.parseLong(id)).orElse(null);
        UserDTO userDTO = new UserDTO(user.getName(),user.getAddress().getAddressId().getAddress_id().toString(),user.getAddress().getState());
        return userDTO;
    }

    public List<User> getUserList() {
        List<User> userList =  userRepository.findAll();
        return userList;
    }
}
