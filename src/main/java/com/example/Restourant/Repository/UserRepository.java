package com.example.Restourant.Repository;

import com.example.Restourant.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
