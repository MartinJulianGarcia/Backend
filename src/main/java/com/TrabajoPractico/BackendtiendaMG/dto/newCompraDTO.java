package com.TrabajoPractico.BackendtiendaMG.dto;
import com.TrabajoPractico.BackendtiendaMG.model.*;




import java.time.LocalDate;
import java.util.List;


public class newCompraDTO {

    private int importe;
    private String nombreusuario;
    private List<Articulo> articulos;

    public newCompraDTO(int importe, String nombreusuario, List<Articulo> articulos) {
        this.importe = importe;
        this.nombreusuario = nombreusuario;
        this.articulos = articulos;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public String getNombreUsuario() {
        return nombreusuario;
    }

    public void setNombreUsuario(int usuario) {
        this.nombreusuario = nombreusuario;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}
