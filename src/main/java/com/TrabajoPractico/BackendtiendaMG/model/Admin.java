package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Entity
//@DiscriminatorValue("ADMIN")
public class Admin extends Usuario
{
    public Admin (Long id, String Nombreusuario, String password, String mail)
    {
        super(id,Nombreusuario,password,mail);
        this.id=id;
    }
    public Admin ()
    {

    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ADMIN"));
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

//    public Long Returncodigo()
//    {
//        return id;
//    }





}


