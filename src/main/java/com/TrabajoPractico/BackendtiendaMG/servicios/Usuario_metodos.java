package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface Usuario_metodos {

    public Usuario CrearUsuario(Usuario u);

    public void ModificarUsuario();

    Admin crearAdmin(Admin admin);

    Cliente crearCliente(Cliente cliente);

    Usuario updateUsuario(Usuario usuario);

    boolean deleteUsuario(Usuario usuario);

    Usuario getByUsername(String username);




}
