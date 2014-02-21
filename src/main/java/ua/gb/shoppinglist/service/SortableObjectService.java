package ua.gb.shoppinglist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.gb.shoppinglist.model.SortableObject;
import ua.gb.shoppinglist.repository.SortableObjectRepository;

@Service
@Transactional
public class SortableObjectService {

    @Autowired
    private SortableObjectRepository sortableObjectRepository;

    public List<SortableObject> getSortableObjects() {
        return sortableObjectRepository.getAllSortableObjects();
    }

    public SortableObject save(SortableObject sortableObject) {
        return sortableObjectRepository.save(sortableObject);
    }
}
