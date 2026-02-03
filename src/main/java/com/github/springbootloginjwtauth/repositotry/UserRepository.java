package com.github.springbootloginjwtauth.repositotry;

import com.github.springbootloginjwtauth.entity.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<CustomUser, Long>
{
    Optional<CustomUser> findCustomUserByUsername(String username);
}
