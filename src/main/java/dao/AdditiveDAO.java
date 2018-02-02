package dao;

import domain.Additive;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;

public class AdditiveDAO implements DAOInterface {

    @Inject
    private EntityManager em;

    @Override
    public void create(Additive additive) {
        EntityTransaction trans = em.getTransaction();
        try {
            trans.begin();
            em.persist(additive);
            trans.commit();
        } catch (Exception e) {
            if(trans != null) {trans.rollback();}
            e.printStackTrace();
        }
    }

    @Override
    public Additive read(String numberE) {
        return em.find(Additive.class, numberE);
    }

    public List<Additive> showAll() {
        List<Additive> additives;
        TypedQuery<Additive> query = em.createNamedQuery("Additive.findAll", Additive.class);

        additives = query.getResultList();

        return additives;
    }

    @Override
    public void update(Additive additive) {

    }

    @Override
    public void delete(String numberE) {

    }
}
