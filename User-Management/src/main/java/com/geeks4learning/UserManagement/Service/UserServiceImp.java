package com.geeks4learning.UserManagement.Service;

import com.geeks4learning.UserManagement.Enum.Roles;
import com.geeks4learning.UserManagement.Model.UserModel;
import com.geeks4learning.UserManagement.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserModel getUserByEmail(String email) {
        return this.userRepository.findByEmail(email).orElseThrow();
    }

    @Override
    public UserModel registerUser(UserModel userModel) {

        var user = UserModel.builder()
                .username(userModel.getUsername())
                .firstname(userModel.getFirstname())
                .lastname(userModel.getLastname())
                .idNumber(userModel.getIdNumber())
                .email(userModel.getEmail())
                .address(userModel.getAddress())
                .password(passwordEncoder.encode(userModel.getPassword()))
                .contact(userModel.getContact())
                .roles(Roles.USER)
                .build();

        this.userRepository.save(user);
        return user;
    }
}
