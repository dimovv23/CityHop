package com.dimovv.city_hop.DAOs;

import com.dimovv.city_hop.entities.UserEntity;
import com.dimovv.city_hop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserDAO {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public UserEntity save(UserEntity user){
        return userRepository.save(user);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }
}
