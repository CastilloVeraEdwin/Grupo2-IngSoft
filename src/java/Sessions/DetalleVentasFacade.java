package Sessions;

import Entity.DetalleVentas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DetalleVentasFacade extends AbstractFacade<DetalleVentas> {

    @PersistenceContext(unitName = "ProyectoPISVentasGP4PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleVentasFacade() {
        super(DetalleVentas.class);
    }
    
}
