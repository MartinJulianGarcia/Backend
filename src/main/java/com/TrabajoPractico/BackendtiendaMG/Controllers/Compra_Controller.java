package com.TrabajoPractico.BackendtiendaMG.Controllers;

import com.TrabajoPractico.BackendtiendaMG.model.*;
import com.TrabajoPractico.BackendtiendaMG.dto.newCompraDTO;
import com.TrabajoPractico.BackendtiendaMG.servicios.Articulo_metodos;


import com.TrabajoPractico.BackendtiendaMG.model.Compra;
import com.TrabajoPractico.BackendtiendaMG.servicios.Compra_metodos;
import org.springframework.beans.factory.annotation.Autowired;


 import org.springframework.web.bind.annotation.*;   //     NO ME FUNCIONA PERO TENGO LA DEPENDENCIA

import java.util.List;


@RestController
@RequestMapping(value = "/api/Compra")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class Compra_Controller {

    @Autowired
    private Compra_metodos compraMetodos;

    @PostMapping(value = "")
    public Compra createCompra(@RequestBody newCompraDTO c) { // @RequestBody indica que el parametro viene en el cuerpo del request, se mapea automaticamente a un objeto Libro
        return compraMetodos.CrearCompra(c.getImporte(), c.getIdUsuario(), c.getArticulos());
    }


    @GetMapping(value = "/usuario/{usuario}")
    public List<Compra> getComprasByusuario(@PathVariable Usuario usuario) {

        return compraMetodos.getCompraByusuario(usuario);
    }


}
