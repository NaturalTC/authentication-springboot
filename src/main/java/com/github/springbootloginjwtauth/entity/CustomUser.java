package com.github.springbootloginjwtauth.entity;

import jakarta.persistence.*;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

// Class the represents a entry in a database
@Entity
@Table(name = "CUSTOM_USER") // name of table to be entered into
public class CustomUser implements UserDetails // Springboot UserDetails Interface for setting up authentication
{

    // Auto-Incremented PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Increment type defined ? Look more into how this works
    private Long id;

    // Object Attributes ( log in info )
    @Column(unique = true)
    private String username;

    private String password;


    // Getters + Setters
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { return List.of(); }

    @Override
    public String getUsername() { return username; }

    @Override
    public @Nullable String getPassword() { return password; }
}
