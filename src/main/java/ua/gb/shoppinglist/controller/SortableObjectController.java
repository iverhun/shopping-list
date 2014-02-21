package ua.gb.shoppinglist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.gb.shoppinglist.model.SortableObject;
import ua.gb.shoppinglist.service.SortableObjectService;

@Controller
@RequestMapping("/so")
public class SortableObjectController {

    @Autowired
    private SortableObjectService sortableObjectService;

    @RequestMapping("/list")
    public String listSo(Model model) {
        List<SortableObject> sortableObjects = sortableObjectService.getSortableObjects();
        model.addAttribute("sortableObjects", sortableObjects);
        return "so/list";
    }

    @RequestMapping("/new")
    public String newSo(Model model) {
        SortableObject sortableObject = new SortableObject("test value: " + System.currentTimeMillis());
        sortableObjectService.save(sortableObject);

        return listSo(model);
    }

}
