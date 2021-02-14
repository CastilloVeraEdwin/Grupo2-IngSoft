/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "VENTAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ventas.findAll", query = "SELECT v FROM Ventas v")
    , @NamedQuery(name = "Ventas.findByIdventas", query = "SELECT v FROM Ventas v WHERE v.idventas = :idventas")
    , @NamedQuery(name = "Ventas.findByNumeroserie", query = "SELECT v FROM Ventas v WHERE v.numeroserie = :numeroserie")
    , @NamedQuery(name = "Ventas.findByFechaventas", query = "SELECT v FROM Ventas v WHERE v.fechaventas = :fechaventas")
    , @NamedQuery(name = "Ventas.findByMonto", query = "SELECT v FROM Ventas v WHERE v.monto = :monto")
    , @NamedQuery(name = "Ventas.findByEstado", query = "SELECT v FROM Ventas v WHERE v.estado = :estado")})
public class Ventas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDVENTAS")
    private BigDecimal idventas;
    @Size(max = 20)
    @Column(name = "NUMEROSERIE")
    private String numeroserie;
    @Column(name = "FECHAVENTAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaventas;
    @Column(name = "MONTO")
    private Double monto;
    @Size(max = 2)
    @Column(name = "ESTADO")
    private String estado;
    @JoinColumn(name = "IDCLIENTE", referencedColumnName = "IDCLIENTE")
    @ManyToOne
    private Cliente idcliente;
    @JoinColumn(name = "IDEMPLEADO", referencedColumnName = "IDEMPLEADO")
    @ManyToOne
    private Empleado idempleado;
    @OneToMany(mappedBy = "idventas")
    private List<DetalleVentas> detalleVentasList;

    public Ventas() {
    }

    public Ventas(BigDecimal idventas, String numeroserie, Date fechaventas, Double monto, String estado, Cliente idcliente, Empleado idempleado) {
        this.idventas = idventas;
        this.numeroserie = numeroserie;
        this.fechaventas = fechaventas;
        this.monto = monto;
        this.estado = estado;
        this.idcliente = idcliente;
        this.idempleado = idempleado;
    }

    public Ventas(BigDecimal idventas) {
        this.idventas = idventas;
    }

    public BigDecimal getIdventas() {
        return idventas;
    }

    public void setIdventas(BigDecimal idventas) {
        this.idventas = idventas;
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public Date getFechaventas() {
        return fechaventas;
    }

    public void setFechaventas(Date fechaventas) {
        this.fechaventas = fechaventas;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Empleado getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Empleado idempleado) {
        this.idempleado = idempleado;
    }

    @XmlTransient
    public List<DetalleVentas> getDetalleVentasList() {
        return detalleVentasList;
    }

    public void setDetalleVentasList(List<DetalleVentas> detalleVentasList) {
        this.detalleVentasList = detalleVentasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idventas != null ? idventas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ventas)) {
            return false;
        }
        Ventas other = (Ventas) object;
        if ((this.idventas == null && other.idventas != null) || (this.idventas != null && !this.idventas.equals(other.idventas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sessions.Ventas[ idventas=" + idventas + " ]";
    }
    
}
