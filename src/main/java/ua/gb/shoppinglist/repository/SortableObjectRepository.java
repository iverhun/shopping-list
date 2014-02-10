package ua.gb.shoppinglist.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.gb.shoppinglist.model.SortableObject;

@Repository
public class SortableObjectRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public SortableObject getById(Long id) {
        return entityManager.find(SortableObject.class, id);
    }

}
