package com.TrabajoPractico.BackendtiendaMG.Controllers;

import com.TrabajoPractico.BackendtiendaMG.model.Usuario;
import com.TrabajoPractico.BackendtiendaMG.servicios.Articulo_metodos;
import com.TrabajoPractico.BackendtiendaMG.servicios.Usuario_metodos;
import org.springframework.beans.factory.annotation.Autowired;




 import org.springframework.web.bind.annotation.*;    //    NO ME FUNCIONA PERO TENGO LA DEPENDENCIA E HICE ISNTALL EN MVN


@RestController
@RequestMapping(value = "/api/Usuario")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class Usuario_Controller {

    @Autowired
    private Usuario_metodos usuarioMetodos;

    @PostMapping (value = "")
    public Usuario CrearUsuario (@RequestBody Usuario u){ return usuarioMetodos.CrearUsuario(u);}



}
