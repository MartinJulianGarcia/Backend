package com.TrabajoPractico.BackendtiendaMG.servicios;
import java.util.ArrayList;
import java.util.List;

import com.TrabajoPractico.BackendtiendaMG.model.*;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class Articulo_metodos_imp implements Articulo_metodos {


    @Autowired
    private Articulo_repositorio Articulo_repositorio;

    @Override
    @Transactional(readOnly = true)
    public List<Articulo>  getAll() {
        return (List<Articulo>) Articulo_repositorio.findAll();
    }

    public Articulo CrearArticulo(Articulo a) {
        this.Articulo_repositorio.save(a);
        return a;
    }

    public boolean eliminarart(String nombreart) {
        if (nombreart == null ) {
            return false;
        }
        Articulo a= this.Articulo_repositorio.findBynombre(nombreart);
        try {
            this.Articulo_repositorio.delete(a);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void IngresarStock(Articulo a)  {
        this.Articulo_repositorio.save(a);
    }

   public void SacarStock(){};

   public void ModificarUsuario(){};

   public Articulo UpdateArticulo(Articulo art)
   {
       if (art.getNombre() == null ) {
           throw new RuntimeException();
       }
       Articulo a= this.Articulo_repositorio.findBynombre(art.getNombre());
       if (a!=null) {
           try {
               a.setPrecio(art.getPrecio());
               a.setStock(art.getStock());
               a.setTemporada(art.getTemporada());
               a.setTipo(art.getTipo());

               this.Articulo_repositorio.save(a);
               return a;
           } catch (Exception e) {
               throw new RuntimeException();
           }
       }
       else {
           throw new RuntimeException();
       }

   }

    public Articulo getArticuloBynombre(String nombre){

        return Articulo_repositorio.findBynombre(nombre) ;
    }

    public List<Articulo> getArticuloBytipo (String tipo)
    {
        return Articulo_repositorio.findBytipo( tipo);
    }

    public List<Articulo> getArticuloBytemporada (String temporada) { return Articulo_repositorio.findBytemporada(temporada);}

    @Override
    public Optional<Articulo> getById(Long id) {
        return Articulo_repositorio.findById(id);
    }
}
