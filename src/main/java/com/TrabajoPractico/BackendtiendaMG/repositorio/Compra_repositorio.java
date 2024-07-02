package com.TrabajoPractico.BackendtiendaMG.repositorio;


import com.TrabajoPractico.BackendtiendaMG.model.*;
import com.TrabajoPractico.BackendtiendaMG.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface Compra_repositorio extends CrudRepository <Compra, Long>{

    //@Override
   // Optional findById(Long id);

    List<Compra> findByusuario (Usuario usuario);

}
