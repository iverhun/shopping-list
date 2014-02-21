package ua.gb.shoppinglist.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public abstract class AbstractRepository<E> {

    private Class<E> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    protected AbstractRepository(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public E getById(Long id) {
        return entityManager.find(entityClass, id);
    }

    public List<E> getAll() {
        CriteriaQuery<E> query = entityManager.getCriteriaBuilder().createQuery(entityClass);
        Root<E> entityRoot = query.from(entityClass);

        CriteriaQuery<E> cc = query.select(entityRoot);
        TypedQuery<E> typedQuery = entityManager.createQuery(cc);
        return typedQuery.getResultList();
    }

    public E save(E entity) {
        return entityManager.merge(entity);
    }
}
