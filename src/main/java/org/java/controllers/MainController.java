package org.java.controllers;

import java.util.List;

import org.java.POJO.Pizza;
import org.java.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private PizzaService pizzaServ;
	
	@GetMapping
	public String index(Model model) {
		
		List<Pizza> pizzas = pizzaServ.findAll();
		
		model.addAttribute("pizzas", pizzas);
		
		return "index";
	}
	
}
