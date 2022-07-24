package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {
	@RequestMapping(value="/daikichi",method=RequestMethod.GET)
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping(value="/daikichi/travel/{city}",method=RequestMethod.GET)
	public String today(@PathVariable("city")  String city) {
		return "Congratulations! You will soon travel to "+ city ;
	}
	
	
	
	
	@RequestMapping(value="/daikichi/lotto/{num}",method=RequestMethod.GET)
	public String tomorrow(@PathVariable("num")  int num) {
		if(num %2 ==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";

		}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
	}
	
	
	

}
