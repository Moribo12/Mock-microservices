package com.geeks4learning.UserManagement.Model;

import com.geeks4learning.UserManagement.Enum.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String username;
    private String firstname;
    private String lastname;
    private String idNumber;
    private String email;
    private String address;
    private String password;
    private String contact;

    @Enumerated(EnumType.STRING)
    private Roles roles;

}
