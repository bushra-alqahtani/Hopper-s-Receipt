package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HelloHuman {
	
//	@RequestMapping("/")
//	public String hello(Model model) {
//		String fname ="Bushra";
//		
//		ArrayList<String> clasof=new ArrayList<String>();
//		clasof.add("maha");
//		clasof.add("nora");
//		clasof.add("sadeem");
//
//		model.addAttribute("fname",fname);
//		model.addAttribute("clasof",clasof);
//		return "index.jsp";
//	}
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name",name);
        model.addAttribute("itemName",itemName);
        model.addAttribute("price",price);
        model.addAttribute("description",description);
        model.addAttribute("vendor",vendor);
        
    
        return "index2.jsp";
    }
	

}
