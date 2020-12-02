package com.example.openshift.springmvc.controller;

import com.example.openshift.springmvc.entity.Fruit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/fruits")
public class FruitController {
    private List<Fruit> fruits = new ArrayList<>();

    @GetMapping
    public String home(Model model) {
        Fruit fruit = new Fruit();
        fruit.setName("apple");
        fruits.add(fruit);
        model.addAttribute("fruits", fruits);     // For the List view
        model.addAttribute("fruitForm", new Fruit()); // For the Form
        return "home";
    }

    @PostMapping
    public String createFruit(@ModelAttribute Fruit fruit) {
        fruits.add(fruit);
        return "redirect:/fruits";
    }


}
