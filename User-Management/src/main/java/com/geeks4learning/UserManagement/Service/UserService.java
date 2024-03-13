package com.geeks4learning.UserManagement.Service;

import com.geeks4learning.UserManagement.Model.UserModel;

public interface UserService {

    public UserModel getUserByEmail(String email);
    public UserModel registerUser(UserModel userModel);

}
