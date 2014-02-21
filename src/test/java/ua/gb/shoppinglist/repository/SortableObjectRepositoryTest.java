package ua.gb.shoppinglist.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import ua.gb.shoppinglist.model.SortableObject;

@ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext-test.xml")
@TransactionConfiguration(defaultRollback = true)
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class SortableObjectRepositoryTest {

    @PersistenceContext
    protected EntityManager entityManager;

	@Autowired
	private SortableObjectRepository sortableObjectRepository;

	@Test
    public void testSaveAndGetById() {
        String testValue = "Test By ID";
        SortableObject sortableObject = sortableObjectRepository.save(new SortableObject(testValue));
        SortableObject sortableObjectFromDb = sortableObjectRepository.getById(sortableObject.getId());
        Assert.assertEquals(testValue, sortableObjectFromDb.getValue());
	}

	@Test
	public void testGetAllSortableObject() {
        sortableObjectRepository.save(new SortableObject("Test By ID"));
        entityManager.flush();
        List<SortableObject> sortableObjects = sortableObjectRepository.getAllSortableObjects();
        Assert.assertEquals(1, sortableObjects.size());
	}
}
