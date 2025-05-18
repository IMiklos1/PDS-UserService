package com.project.userservice.service;

import com.project.userservice.dto.UserDTO;
import com.project.userservice.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserService {
    User createUser(UserDTO dto);
    Optional<User> getUserById(UUID id);
}
