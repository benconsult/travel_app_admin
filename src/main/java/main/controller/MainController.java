package main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import main.model.Tour;

@Controller
public class MainController {
	
	//no db yet
	private List<Tour> tours = new ArrayList<>();

	@RequestMapping("/")
	public String getHome() {
		
		return "index";
	}
	
	@GetMapping("/addTour")
	public String showForm(Model model) {
		model.addAttribute("tour", new Tour());
		return "form";
	}
	
	@PostMapping("/processForm")
	private String showTourData(@Valid @ModelAttribute Tour tour, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "form";
		}
		
		tours.add(tour);
		
		return "redirect:showOffer";
		
	}
	
	@GetMapping("/showOffer")
	public String getTour(Model model) {
		
		model.addAttribute("tours", tours);
		
		return "tours";
	}
}
