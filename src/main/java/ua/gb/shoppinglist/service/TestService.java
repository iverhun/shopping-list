package ua.gb.shoppinglist.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public List<String> getShoppingList() {
        return Arrays.asList("Milk", "Apples", "Banana");
    }

}
