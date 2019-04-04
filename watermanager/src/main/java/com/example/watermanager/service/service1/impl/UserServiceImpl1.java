package com.example.watermanager.service.service1.impl;


import com.example.watermanager.domain.User;
import com.example.watermanager.repository.repository1.UserRepository;
import com.example.watermanager.service.service1.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl1 implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public User userLogin(@Param("name") String name) {
        return userRepository.userLogin(name);
    }


}
