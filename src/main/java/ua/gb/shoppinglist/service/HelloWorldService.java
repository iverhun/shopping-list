package ua.gb.shoppinglist.service;

import java.util.ArrayList;
import java.util.List;
import ua.gb.shoppinglist.service.SortableObject;

import org.springframework.stereotype.Service;


// @Deprecated
@Service
public class HelloWorldService {
	public List<SortableObject> list_vasja = new ArrayList<>();
	
	public List<SortableObject> getList_vasja() {
		return list_vasja;
	}
	public void setList_vasja(List<SortableObject> list_vasja) {
		this.list_vasja = list_vasja;
	}
}