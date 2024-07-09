package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.model.*;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Compra_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Usuario_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class Compra_metodos_imp implements Compra_metodos {

    @Autowired
    private Compra_repositorio Compra_repositorio;

    @Autowired
    private Usuario_repositorio usuarioRepositorio;

    public Compra CrearCompra(int importe, long idusuario, List<Articulo> articulos) {
        Optional<Usuario> optionalUsuario= usuarioRepositorio.findById(idusuario);
        if (optionalUsuario.isPresent()) {
            Usuario usuario1 = optionalUsuario.get();
            // usar el objeto usuario
            Compra compra=new Compra(LocalDate.now(),importe,"tarjeta",articulos,usuario1);
            this.Compra_repositorio.save(compra);
            return compra;
        }
        else {throw new RuntimeException();}


    }

//    public Prestamo createPrestamo(LocalDate fechaSolicitud, Usuario usuario, List<Libro> libros) {
//        LocalDate fechaDevolucion = usuario.calcularFechaDevolucion(fechaSolicitud);
//        Prestamo prestamo = new Prestamo(fechaSolicitud, fechaDevolucion, usuario, libros);
//        for (Libro libro : prestamo.getLibros()) {
//            libro.setEstado("PRESTADO");
//            this.libroRepository.save(libro);
//        }
//        this.prestamoRepository.save(prestamo);
//        return prestamo;
//    }

    @Override
    public List<Compra> getCompraByusuario(Usuario u) {
       return Compra_repositorio.findByusuario(u);

    }

    // public boolean eliminarcompra(compra c);


}
