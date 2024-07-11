package com.TrabajoPractico.BackendtiendaMG.servicios;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Usuario_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import com.TrabajoPractico.BackendtiendaMG.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class Usuario_metodos_imp implements Usuario_metodos{

    @Override
    public Usuario CrearUsuario(Usuario u) {
        Usuario_repositorio.save(u);
        return u;
    }


    @Autowired
    private Usuario_repositorio Usuario_repositorio;

   @Autowired
  private PasswordEncoder passwordEncoder;

    public void ModificarUsuario(){};

    @Override
    @Transactional
    public Cliente crearCliente(Cliente cliente) {
       // cliente.setPassword(cliente.getPassword());   //passwordEncoder.encode( No funciona
        cliente.setPassword(passwordEncoder.encode(cliente.getPassword()));
        return Usuario_repositorio.save(cliente);
    }

    @Override
    @Transactional
    public Admin crearAdmin(Admin admin) {
     //  admin.setPassword.passwordEncoder.encode(admin.getPassword());  //passwordEncoder.encode( No funciona)
        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        return Usuario_repositorio.save(admin);
    }

    @Override
    @Transactional
    public Usuario updateUsuario(Usuario usuario) {
        return Usuario_repositorio.save(usuario);
    }

    @Override
    @Transactional
    public boolean deleteUsuario(Usuario usuario) {

        try {
            Usuario_repositorio.delete(usuario);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    @Override
    @Transactional
    public Usuario getByUsername(String username) {
        Optional<Usuario> optionalUsuario = Usuario_repositorio.findByUsername(username);
        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            return usuario;
        } else {
            throw new RuntimeException();
        }


    }

}
