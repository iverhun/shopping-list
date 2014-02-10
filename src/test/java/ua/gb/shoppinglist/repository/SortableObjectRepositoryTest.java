package ua.gb.shoppinglist.repository;

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
        SortableObject sortableObject = sortableObjectRepository.getById(1L);
        System.out.println(sortableObject);
    }

}
