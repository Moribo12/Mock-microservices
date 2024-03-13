package com.geeks4learning.UserManagement.Controller;

import com.geeks4learning.UserManagement.Dto.UserDto;
import com.geeks4learning.UserManagement.Model.UserModel;
import com.geeks4learning.UserManagement.ResponseObject.ResponseObject;
import com.geeks4learning.UserManagement.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

   private final UserService userService;

    @GetMapping("/{email}")
    public UserModel getUserByEmail(@PathVariable String email){
        return this.userService.getUserByEmail(email);
    }

    @PostMapping("/register")
    public String registerUser(@RequestBody UserModel userModel){
         this.userService.registerUser(userModel);
         return "Successfully";
    }



}
