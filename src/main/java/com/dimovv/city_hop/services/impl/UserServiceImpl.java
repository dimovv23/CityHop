package com.dimovv.city_hop.services.impl;

import com.dimovv.city_hop.DAOs.UserDAO;
import com.dimovv.city_hop.DTOs.UserDTO;
import com.dimovv.city_hop.entities.UserEntity;
import com.dimovv.city_hop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public List<UserDTO> getAllUsers() {
        return userDAO.getAllUsers().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(Long id) {
        return userDAO.findById(id).map(this::convertToDTO).orElse(null);
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        return convertToDTO(userDAO.save(convertToEntity(userDTO)));
    }

    @Override
    public void delete(Long id) {
        userDAO.deleteById(id);
    }

    private UserDTO convertToDTO(UserEntity user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setPhoneNumber(user.getPhoneNumber());
        return dto;
    }

    private UserEntity convertToEntity(UserDTO userDTO) {
        UserEntity user = new UserEntity();
        user.setId(userDTO.getId());
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        return user;
    }
}
