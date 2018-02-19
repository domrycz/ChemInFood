package dao;

import domain.Additive;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class AdditiveDAO implements DAOInterface {

    @Inject
    private EntityManager em;

    @Override
    @Transactional
    public void create(Additive additive) {
        em.persist(additive);
    }

    @Override
    public Additive read(String numberE) {
        return em.find(Additive.class, numberE);
    }

    public Additive readByName(String language, String name) {
        Additive additive;
        if(language.equals("eng")) {
            TypedQuery<Additive> queryEng = em.createNamedQuery("Additive.findByEngName", Additive.class);
            additive = queryEng.setParameter("name", name).getSingleResult();
        } else {
            TypedQuery<Additive> queryPol = em.createNamedQuery("Additive.findByPolName", Additive.class);
            additive = queryPol.setParameter("name", name).getSingleResult();
        }
        return additive;
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
