package com.nikki.springmvc;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nikki.springmvc.dao.AlienDao;
import com.nikki.springmvc.model.Alien;

@Controller
public class HomeController {
	
	
	@Autowired
	private AlienDao dao;
	
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
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a)
	{
		return "result";	
	}
	
	@RequestMapping("getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("result", dao.getAliens());
		
		return "showAliens";
	}
	
}
