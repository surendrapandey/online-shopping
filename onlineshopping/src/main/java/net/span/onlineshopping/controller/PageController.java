package net.span.onlineshopping.controller;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/","/home","index"})
	public ModelAndView index( ){
		ModelAndView mv = new ModelAndView("page");
	}

}
