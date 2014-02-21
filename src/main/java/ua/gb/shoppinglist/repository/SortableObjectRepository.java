package ua.gb.shoppinglist.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import ua.gb.shoppinglist.model.SortableObject;

@Repository
public class SortableObjectRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public SortableObject getById(Long id) {
        return entityManager.find(SortableObject.class, id);
    }

    public List<SortableObject> getAllSortableObjects() {
        // String queryString = "SELECT * FROM sortable_object";
        String queryString = "SELECT so1 FROM SortableObject so1";
        TypedQuery<SortableObject> query = entityManager.createQuery(queryString, SortableObject.class);
        return query.getResultList();
    }

    public List<String> getAllSortableObjectValues() {
        // String queryString = "SELECT * FROM sortable_object";
        String queryString = "SELECT so.value FROM SortableObject so";
        TypedQuery<String> query = entityManager.createQuery(queryString, String.class);
        return query.getResultList();
    }

    public SortableObject save(SortableObject sortableObject) {
        return entityManager.merge(sortableObject);
    }
}
