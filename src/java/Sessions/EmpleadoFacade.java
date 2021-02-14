package Sessions;

import Entity.Empleado;
import java.math.BigDecimal;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmpleadoFacade extends AbstractFacade<Empleado> {

    @PersistenceContext(unitName = "ProyectoPISVentasGP4PU")
    private EntityManager em;
    private BigDecimal idempleado;
    private String dni;
    private String nombres;
    private String telefono;
    private String estado;
    private String usuario;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoFacade() {
        super(Empleado.class);
    }
    
    public void save(BigDecimal idempleado, String dni, String nombres, String telefono, String estado, String usuario){
        try{
           Empleado emEmpleado = new Empleado(idempleado,dni,nombres,telefono,estado,usuario); 
           em.persist(emEmpleado);
        }catch(Exception e){
            throw new EJBException(e.getMessage());
        }
    }   
}
