package Beans;

import Sessions.ProductoFacade;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "productoBean")
@RequestScoped
public class ProductoBean {

    @EJB
    private ProductoFacade productoFacade;

    private BigDecimal idproducto;
    private String nombres;
    private Double precio;
    private BigInteger stock;
    private String estado;
    
    public ProductoBean() {
    }

    public BigDecimal getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(BigDecimal idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public BigInteger getStock() {
        return stock;
    }

    public void setStock(BigInteger stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
