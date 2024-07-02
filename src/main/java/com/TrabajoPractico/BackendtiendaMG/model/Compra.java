package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Compra
{
    public Compra ( Date fecha, int importe,  String mediodepago, long id, List<Articulo> arts)
    {

        this.fecha=fecha;
        this.importe=importe;
        this.mediodepago=mediodepago;
        this.id=id;
        articulos=arts;
        this.usuario=new Cliente();

    }

    public Compra(){}

    @ManyToMany
    @JoinTable(
            name = "compra_articulos",
            joinColumns = @JoinColumn(name = "id_compra"),
            inverseJoinColumns = @JoinColumn(name = "id_articulo")
    )
    List <Articulo> articulos;


    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    Usuario usuario;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    Date fecha;
    int importe;
    String mediodepago;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }


    public String getMediodepago() {
        return mediodepago;
    }

    public void setMediodepago(String mediodepago) {
        this.mediodepago = mediodepago;
    }


    public List<Articulo> getArticulos() {
        return articulos;
    }


    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
