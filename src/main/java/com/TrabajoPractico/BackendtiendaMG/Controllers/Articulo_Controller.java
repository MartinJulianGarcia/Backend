package com.TrabajoPractico.BackendtiendaMG.Controllers;


import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import com.TrabajoPractico.BackendtiendaMG.servicios.Articulo_metodos;
import com.TrabajoPractico.BackendtiendaMG.servicios.Articulo_metodos_imp;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.*;       // NO ME FUNCIONA PERO TENGO LA DEPENDENCIA



@RestController
@RequestMapping(value = "/api/Articulo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class Articulo_Controller {


    @Autowired
    private Articulo_metodos articuloMetodos;   //TIRA ERROR, VER POR QUE

    @GetMapping(value = "/nombre/{nombre}")
    public Articulo getArticuloBynombre(@PathVariable String nombre) {
        return articuloMetodos.getArticuloBynombre(nombre);
    }

    @GetMapping(value = "/id/{id}")
    public Articulo getArticuloByid(@PathVariable Long id) {
        return articuloMetodos.getById(id).orElse(null);
    }

    @GetMapping(value = "/tipo/{tipo}")
    public List<Articulo> getArticuloBytipo(@PathVariable String tipo) {

        return articuloMetodos.getArticuloBytipo(tipo);
    }

    @GetMapping(value = "/{temporada}")
    public List<Articulo> getArticuloBytemporada(@PathVariable String temporada) {

        return articuloMetodos.getArticuloBytemporada( temporada );
    }

    @GetMapping(value = "")
    public List<Articulo> getAll( ) {

        return articuloMetodos.getAll();
    }

   @PostMapping(value = "")
    public Articulo createArticulo(@RequestBody Articulo art) { // @RequestBody indica que el parametro viene en el cuerpo del request, se mapea automaticamente a un objeto Libro
     return articuloMetodos.CrearArticulo(art);
   }

    @DeleteMapping(value = "/{nombreart}")
    public boolean eliminarart(@PathVariable String nombreart) {
        return articuloMetodos.eliminarart(nombreart);
    }


}
