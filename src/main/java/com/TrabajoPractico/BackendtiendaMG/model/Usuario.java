package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario implements UserDetails
    {
        public Usuario (Long id, String Nombreusuario, String password, String mail)
        {
            this.id=id;
            this.username=Nombreusuario;
            this.password=password;
            this.mail=mail;
            miscompras=new ArrayList<Compra>();
        }
        public Usuario ()
        {
        }
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;

        @Column(nullable = false, length = 50, unique = true)
        private String username;

        @Column(nullable = false)
        private String password;

        String mail;

       @OneToMany(mappedBy = "usuario")
        List<Compra> miscompras;

       @OneToOne
       @JoinColumn( name = "id_direccion")
       Direccion direccion;

        @OneToOne
        @JoinColumn(name = "id_tarjeta")
       Tarjeta tarjeta;

        public String getUsername() {
            return username;
        }

        public void setUsername(String nombreusuario) {
            this.username=nombreusuario;
        }

        public void setId(Long id) {
            this.id=id;
        }

        public Long getId() {
            return id;
        }

//        public void setContra(String contra) {
//            this.contra = contra;
//        }
//
//        public String getContra() {
//            return contra;
//        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getMail() {
            return mail;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("CLIENTE"));
            return authorities;
        }
    }
