package com.TrabajoPractico.BackendtiendaMG.servicios;


import com.TrabajoPractico.BackendtiendaMG.model.Usuario;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Usuario_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public class UserDetailServiceImp implements UserDetailsService {
    @Autowired
    private Usuario_repositorio usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> optionalUsuario = this.usuarioRepository.findByUsername(username);
        if(optionalUsuario.isEmpty()) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        } else {
            Usuario usuario = optionalUsuario.get();
            return (UserDetails) usuario;  // no hace falta castear pq usuario implementa userdetails
        }
    }

}
