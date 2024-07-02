package com.TrabajoPractico.BackendtiendaMG.model;    // esto hace que todas mis clases se importen juntas

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class Articulo
{
    public Articulo (Long idart, String nombre,int stock, int precio, String tipo, String temporada)
    {
        this.id=idart;
        this.nombre=nombre;
        this.stock=stock;
        this.temporada=temporada;
        this.precio=precio;
        this.tipo=tipo;
        compras= new ArrayList<>();

    }
    public Articulo ()
    {
    }

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)// poner la  notacion para que sea automatico
    Long id;

    @Column(name = "nombre", length = 50)
    String nombre;
    @Column(name = "stock", length = 50)
    int stock;

    @Column(name = "precio", length = 50)
    int precio;

    @Column(name = "temporada", length = 50)
    String temporada;

    @Column(name = "tipo", length = 50)
    String tipo;

   @ManyToMany(mappedBy = "articulos")
    List <Compra> compras;

    public void setComprasconesteart(List<Compra> comprasconesteart) {
        this.compras = comprasconesteart;
    }

    public List<Compra> getComprasconesteart() {
        return compras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idart) {
        this.id = idart;

    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getTipo () {
        return this. tipo; }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public static String retornarclase ()
        {
            return "Esta es la clase Articulo";

        }



}
