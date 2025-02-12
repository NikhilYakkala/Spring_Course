package com.nikki.springmvcboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nikki.springmvcboot.model.Alien;

@Controller
public class HomeController {
	
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("names", "Aliens");
		
	}
	
	@RequestMapping("/")
	public String home()
	{
		/* System.out.println("Requested Home Page...."); */
		return "index";	
	}
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int a,@RequestParam("num2") int b)
	{	
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("result");
	
		int c = a + b;
		
		mv.addObject("result",c);
		
		return mv;
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		List<Alien> a = Arrays.asList(new Alien(1,"nikhil"),new Alien(2,"nikki"));
		
		m.addAttribute("result",a);
		
		return "showAliens";
	}
	
	
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a)
	{
		return "result";	
	}
}
