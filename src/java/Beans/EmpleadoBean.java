package Beans;

import Sessions.EmpleadoFacade;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "empleadoBean")
@RequestScoped
public class EmpleadoBean {

    @EJB
    private EmpleadoFacade empleadoFacade;

    private BigDecimal idempleado;
    private String dni;
    private String nombres;
    private String telefono;
    private String estado;
    private String usuario;
    
    public EmpleadoBean() {
    }

    public BigDecimal getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(BigDecimal idempleado) {
        this.idempleado = idempleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public void save(){
        try{
            empleadoFacade.save(idempleado, dni, nombres, telefono, estado, usuario);
        }catch(Exception e){
            throw new EJBException(e.getMessage());
        }
    }
}
