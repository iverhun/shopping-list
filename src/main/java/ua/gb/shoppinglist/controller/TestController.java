package ua.gb.shoppinglist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ua.gb.shoppinglist.repository.SortableObjectRepository;
import ua.gb.shoppinglist.service.TestService;

@Controller
public class TestController {

    private TestService testService;

    @Autowired
    private SortableObjectRepository sortableObjectRepository;

    @RequestMapping("/diagonal")
    public String showDiagonal(@RequestParam(value = "width", required = true) Integer rectangleWidth,
            @RequestParam(value = "height") Integer rectangleHeight, Model model) {

        model.addAttribute("rectangleWidth", rectangleWidth);
        model.addAttribute("rectangleHeight", rectangleHeight);
        model.addAttribute("rectangleDiagonal", Math.hypot(rectangleHeight, rectangleWidth));
        model.addAttribute("rectangleArea", rectangleHeight * rectangleWidth);

        return "rectangle/diagonal";
    }

    @RequestMapping("/shoppingList")
    public String serviceDemo(Model model) {
        model.addAttribute("shoppingItems", testService.getShoppingList());
        return "shopping-list";
    }


    @Autowired
    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
