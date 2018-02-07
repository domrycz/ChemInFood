package dao;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.enterprise.inject.Produces;

public class EntityManagerHelper {

    @PersistenceContext
    EntityManager em;

    @Produces
    @RequestScoped
    public EntityManager createEntityManager() {
        return em;
    }

    public void closeEntityManager(@Disposes EntityManager em) {
        em.close();
    }
}
