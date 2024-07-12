package com.TrabajoPractico.BackendtiendaMG.repositorio;


import com.TrabajoPractico.BackendtiendaMG.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface
Articulo_repositorio extends CrudRepository <Articulo, Long> {

   // @Override
    //Optional findById(Long id);

    Articulo findBynombre (String nombreart);

    List<Articulo> findBytemporada (String temporada);

    List<Articulo> findBytipo (String tipo);



}
