package com.luizlacerda.Medigram.repository;

import com.luizlacerda.Medigram.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {


    User deleteUserById(Long id);
}
