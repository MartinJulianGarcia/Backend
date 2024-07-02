package com.TrabajoPractico.BackendtiendaMG.model;
import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Entity
public class Tarjeta
{
    public Tarjeta(String tipo, int numero, int id)
    {
        this.numero= numero;
        this.tipo=tipo;
        this.id=id;

    }

    public Tarjeta()
    {}
    @Id
    int numero;

    @OneToOne (mappedBy = "tarjeta")
            Usuario usuario;

    String tipo;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
            return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}