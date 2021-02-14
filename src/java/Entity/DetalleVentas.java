/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "DETALLE_VENTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleVentas.findAll", query = "SELECT d FROM DetalleVentas d")
    , @NamedQuery(name = "DetalleVentas.findByIddetalleventas", query = "SELECT d FROM DetalleVentas d WHERE d.iddetalleventas = :iddetalleventas")
    , @NamedQuery(name = "DetalleVentas.findByCantidad", query = "SELECT d FROM DetalleVentas d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetalleVentas.findByPrecioventa", query = "SELECT d FROM DetalleVentas d WHERE d.precioventa = :precioventa")})
public class DetalleVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDETALLEVENTAS")
    private BigDecimal iddetalleventas;
    @Column(name = "CANTIDAD")
    private BigInteger cantidad;
    @Column(name = "PRECIOVENTA")
    private Double precioventa;
    @JoinColumn(name = "IDPRODUCTO", referencedColumnName = "IDPRODUCTO")
    @ManyToOne
    private Producto idproducto;
    @JoinColumn(name = "IDVENTAS", referencedColumnName = "IDVENTAS")
    @ManyToOne
    private Ventas idventas;

    public DetalleVentas() {
    }

    public DetalleVentas(BigDecimal iddetalleventas, BigInteger cantidad, Double precioventa, Producto idproducto, Ventas idventas) {
        this.iddetalleventas = iddetalleventas;
        this.cantidad = cantidad;
        this.precioventa = precioventa;
        this.idproducto = idproducto;
        this.idventas = idventas;
    }

    public DetalleVentas(BigDecimal iddetalleventas) {
        this.iddetalleventas = iddetalleventas;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddetalleventas != null ? iddetalleventas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVentas)) {
            return false;
        }
        DetalleVentas other = (DetalleVentas) object;
        if ((this.iddetalleventas == null && other.iddetalleventas != null) || (this.iddetalleventas != null && !this.iddetalleventas.equals(other.iddetalleventas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sessions.DetalleVentas[ iddetalleventas=" + iddetalleventas + " ]";
    }
    
}
