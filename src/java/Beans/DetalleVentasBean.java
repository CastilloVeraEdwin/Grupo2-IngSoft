package Beans;

import Entity.Producto;
import Entity.Ventas;
import Sessions.DetalleVentasFacade;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "detalleVentasBean")
@RequestScoped
public class DetalleVentasBean {

    @EJB
    private DetalleVentasFacade detalleVentasFacade;
    
    private BigDecimal iddetalleventas;
    private BigInteger cantidad;
    private Double precioventa;
    private Producto idproducto;
    private Ventas idventas;

    public DetalleVentasBean() {
    }

    public BigDecimal getIddetalleventas() {
        return iddetalleventas;
    }

    public void setIddetalleventas(BigDecimal iddetalleventas) {
        this.iddetalleventas = iddetalleventas;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Double precioventa) {
        this.precioventa = precioventa;
    }

    public Producto getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Producto idproducto) {
        this.idproducto = idproducto;
    }

    public Ventas getIdventas() {
        return idventas;
    }

    public void setIdventas(Ventas idventas) {
        this.idventas = idventas;
    }
    
}
