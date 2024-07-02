package com.TrabajoPractico.BackendtiendaMG.servicios;


import com.TrabajoPractico.BackendtiendaMG.model.*;
import com.TrabajoPractico.BackendtiendaMG.model.Compra;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public interface Compra_metodos {



    public Compra CrearCompra(Compra c);

   // public boolean eliminarcompra(Compra c);

    List<Compra> getCompraByusuario (Usuario usuario);


}
