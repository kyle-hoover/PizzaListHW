package com.kyle.pizzalist.subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaListController {

	@Autowired
	private PizzaListRepository pizzaListRepository;
	
	@GetMapping(value = "/")
	public String index(PizzaList pizzaList) {
		return "pizzaList/index";
	}
	
	private PizzaList pizzaList;
	
	@PostMapping(value = "/")
    public String addNewPizzaList(PizzaList pizzaList, Model model) {
		pizzaListRepository.save(new PizzaList(pizzaList.getName(), pizzaList.getEmail(), pizzaList.getPizzaChoice(), pizzaList.getSignedUp()));
		model.addAttribute("name", pizzaList.getName());
		model.addAttribute("email", pizzaList.getEmail());
		model.addAttribute("pizzaChoice", pizzaList.getPizzaChoice());
	return "pizzaList/result";
    }
}
