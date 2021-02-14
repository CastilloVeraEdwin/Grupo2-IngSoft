package Beans;

import Entity.Cliente;
import Entity.Empleado;
import Sessions.VentasFacade;
import java.math.BigDecimal;
import java.util.Date;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "ventasBean")
@RequestScoped
public class VentasBean {

    @EJB
    private VentasFacade ventasFacade;
    
    private BigDecimal idventas;
    private String numeroserie;
    private Date fechaventas;
    private Double monto;
    private String estado;
    private Cliente idcliente;
    private Empleado idempleado;
    
    public VentasBean() {
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
    
}
