package ua.gb.shoppinglist.repository;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import ua.gb.shoppinglist.model.SortableObject;

@ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext-test.xml")
@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
public class SortableObjectRepositoryTest {

	@Autowired
	private SortableObjectRepository sortableObjectRepository;

	@Test
	public void testGetById() {
		SortableObject sortableObject = sortableObjectRepository.getById(100L);
		SortableObject sortableObject1 = sortableObjectRepository.getById(100L);
		System.out.println(sortableObject);
		System.out.println(sortableObject1);
		Assert.assertEquals("Сир", sortableObject.getValue());
	}

	@Test
//	@Ignore
	public void testGetAllSortableObject() {
		System.out.println(sortableObjectRepository.getAllSortableObject());	
		System.out.println("List");
		for (SortableObject tmp : sortableObjectRepository.getAllSortableObject()) {
			System.out.println(tmp);
		}
	}

	@Test
	public void test() {
		System.out.println("Test out");
	}    
	
//	@Test
//	public void testpushToDB() {
//		sortableObjectRepository.pushSortableObject();
//		SortableObject sortableObject = sortableObjectRepository.getById(555555L);
//		System.out.println(sortableObject);
//		Assert.assertEquals("Value bbbbbbbbb", sortableObject.getValue());
//	}
//	
//	
	@Test
    public void testPushToDB() {
        String testValue = "Value bbbbbbbbb";
        SortableObject newSortableObject = sortableObjectRepository.pushSortableObject(new SortableObject(testValue));
        SortableObject sortableObjectFromDb = sortableObjectRepository.getById(newSortableObject.getId());

        System.out.println(sortableObjectFromDb);
        Assert.assertEquals(testValue, sortableObjectFromDb.getValue());
    }
}
