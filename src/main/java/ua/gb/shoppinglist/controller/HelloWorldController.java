package ua.gb.shoppinglist.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.gb.shoppinglist.model.SortableObject;
import ua.gb.shoppinglist.service.HelloWorldService;
import ua.gb.shoppinglist.util.SortableObjectComparator;

// @Deprecated
@Controller
public class HelloWorldController {
	@RequestMapping("/newshoppingList")
	public String serviceDemo(Model model) {
		
		model.addAttribute("newrectangleWidth", 20);
		
		SortableObject obj = new SortableObject(5 , "Value c");
		model.addAttribute("sortableObject1", obj.toString());
		model.addAttribute("sortableObject2", obj);
		
		List<SortableObject> list_vasja = new ArrayList<SortableObject>(); 	
		list_vasja.add(new SortableObject(5 , "Value c"));
		SortableObject obj1 = new SortableObject(55 , "Value bb");
		list_vasja.add(obj1);
		model.addAttribute("sortableObject3", list_vasja.get(1).toString());
		model.addAttribute("assashoppingItems2", list_vasja);
		
		List<String> listStringVasja = Arrays.asList("111", "222", "333");		 
		model.addAttribute("assashoppingItems1", listStringVasja);		 
		
		HelloWorldService helloWorldService = new HelloWorldService();
		helloWorldService.list_vasja.add(new SortableObject(94444 , "Value 14555555555"));
		helloWorldService.list_vasja.add(new SortableObject(944 , "Value 14555555555"));
		helloWorldService.list_vasja.add(new SortableObject(44 , "Value 14555555555"));
		helloWorldService.list_vasja.add(new SortableObject(9444 , "Value 14555555555"));		
		Collections.sort(helloWorldService.list_vasja, SortableObjectComparator.IdAscComparator);
		model.addAttribute("assashoppingItems3", helloWorldService.list_vasja);

		return "newshopping-list";
	}	
	
	@RequestMapping("/thDemo")
	public String thDemoo(Model model) {
		
		return "home";
	}		
}