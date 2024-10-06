package com.dimovv.city_hop.services;

import com.dimovv.city_hop.DTOs.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO findById(Long id);
    UserDTO save(UserDTO userDTO);
    void delete(Long id);
}
