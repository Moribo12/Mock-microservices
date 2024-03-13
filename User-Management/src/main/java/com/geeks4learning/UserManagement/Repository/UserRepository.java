package com.geeks4learning.UserManagement.Repository;

import com.geeks4learning.UserManagement.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {

   Optional<UserModel> findByEmail(String email);

}
