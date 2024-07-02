package com.TrabajoPractico.BackendtiendaMG.model;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Direccion
{
    public Direccion (String calle, String ciudad, String provincia, int cp)
    {
        this.calle=calle;
        this.ciudad=ciudad;
        this.provincia=provincia;
        this.cp=cp;

    }

    public Direccion(){}

    @Id
    Long id;


    String calle;
     String ciudad;
     String provincia;
     int cp;
    @OneToOne (mappedBy = "direccion")
    Usuario usuario;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getCp() {
        return cp;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}