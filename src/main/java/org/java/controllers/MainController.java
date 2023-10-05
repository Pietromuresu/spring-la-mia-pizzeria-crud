package org.java.controllers;

import java.util.List;

import org.java.POJO.Pizza;
import org.java.serv.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/{name}")
	public String getByName(Model model, 
							@RequestParam(required = false) String name) {
		List<Pizza> pizzas = null;
		
		String searched = name;
		
		if(name.isEmpty()) {
			
			pizzas = pizzaServ.findAll();
		}else {
			
			pizzas = pizzaServ.findByName(name);
		}
		
		model.addAttribute("pizzas", pizzas);
		model.addAttribute("searchedName", searched);
		
		return "index";
	}
	
	@GetMapping("pizza/{id}")
	public String show(@PathVariable Long id, Model model) {
		
		Pizza pizza = pizzaServ.findById(id);
		
		model.addAttribute("pizza", pizza);
		
		return "show";
	}
	
}
