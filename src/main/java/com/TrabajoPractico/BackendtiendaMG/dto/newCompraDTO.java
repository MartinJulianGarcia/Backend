package com.TrabajoPractico.BackendtiendaMG.dto;
import com.TrabajoPractico.BackendtiendaMG.model.*;




import java.time.LocalDate;
import java.util.List;


public class newCompraDTO {

    private int importe;
    private int idusuario;
    private List<Articulo> articulos;

    public newCompraDTO(int importe, int idusuario, List<Articulo> articulos) {
        this.importe = importe;
        this.idusuario = idusuario;
        this.articulos = articulos;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int getIdUsuario() {
        return idusuario;
    }

    public void setIdusuario(int usuario) {
        this.idusuario = idusuario;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
}
