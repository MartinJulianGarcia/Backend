package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface Articulo_metodos {

    public Articulo CrearArticulo(Articulo a);

    public boolean eliminarart(Articulo a);

    public void IngresarStock(Articulo a);

    public void SacarStock();

    public void ModificarUsuario();

    public void ModificarArticulo();

    Articulo getArticuloBynombre (String nombre);

    List<Articulo> getArticuloBytipo (String tipo);

    List<Articulo> getArticuloBytemporada (String temporada);

    public Optional<Articulo> getById(Long id);

    List<Articulo> getAll();



}

