package com.TrabajoPractico.BackendtiendaMG.repositorio;


import com.TrabajoPractico.BackendtiendaMG.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface Usuario_repositorio extends CrudRepository <Usuario, Long>{
    //@Override
   // Optional findById(Long id);


    Optional<Usuario> findByUsername (String username);

}
