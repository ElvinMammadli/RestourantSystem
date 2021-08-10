package com.example.Restourant.Repository;

import com.example.Restourant.Model.Restourant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RestourantRepository extends JpaRepository< Restourant,Long> {
   Optional<Restourant>  findByUsername(String username);
}
