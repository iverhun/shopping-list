package ua.gb.shoppinglist.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.gb.shoppinglist.model.SortableObject;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

@Repository
public class SortableObjectRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public SortableObject getById(Long id) {
        return entityManager.find(SortableObject.class, id);
    }

    @Transactional
    @SuppressWarnings("unchecked") 
    //Аннотация @SupressWarnings  указывает на то, что именованное предупреждение (warning) 
    //компилятора должно быть подавлено в аннотируемом элементе (и во всех содержащихся в 
    //нём программных элементах)  
    public List<SortableObject> getAllSortableObject() {
    	//String queryString = "SELECT * FROM sortable_object";
    	String queryString = "SELECT so1 FROM SortableObject so1";
    	Query query = entityManager.createQuery(queryString);
    	return query.getResultList();	
    }  

    @Transactional
    @SuppressWarnings("unchecked") 
    //Аннотация @SupressWarnings  указывает на то, что именованное предупреждение (warning) 
    //компилятора должно быть подавлено в аннотируемом элементе (и во всех содержащихся в 
    //нём программных элементах)  
    public List<String> getAllSortableObjectValues() {
    	//String queryString = "SELECT * FROM sortable_object";
    	String queryString = "SELECT so.value FROM SortableObject so";
    	Query query = entityManager.createQuery(queryString);
    	return query.getResultList();	
    }  
    

//    @Transactional
//  //  @SuppressWarnings("unchecked") 
//    //INSERT INTO `shoppinglist`.`sortable_object` (`Id`, `Value`) VALUES (222, 'Сало');
//    public  void pushSortableObject() {
//    	//String queryString = "SELECT * FROM sortable_object";
////    	String queryString = "SELECT so1 FROM SortableObject so1";
//    	SortableObject obj1 = new SortableObject(555555 , "Value bbbbbbbbb");
////    	entityManager.persist(obj1);
//    	entityManager.merge(obj1);
//    	entityManager.flush();
////    	Session session = (Session) entityManager.getDelegate();
////		session.setFlushMode(FlushMode.COMMIT);
////		Transaction trans = session.beginTransaction();    	
////		session.save(obj1);
////		trans.commit();  
//		
//    	//entityManager.flush();
////    	res = query.executeUpdate();
//    }  
    
//    @Transactional
//    @SuppressWarnings("unchecked") 
//    public  void pushSortableObject() {
//    	SortableObject obj1 = new SortableObject(555555 , "Value bbbbbbbbb");
//    	entityManager.merge(obj1);
//    	entityManager.flush();
//    }  
//    
//    public SortableObject pushSortableObject() {
//        SortableObject obj1 = new SortableObject(555555L, "Value bbbbbbbbb");
//        return entityManager.merge(obj1);
//    }
    @Transactional
    public SortableObject pushSortableObject(SortableObject sortableObject) {
        return entityManager.merge(sortableObject);
    }
}
