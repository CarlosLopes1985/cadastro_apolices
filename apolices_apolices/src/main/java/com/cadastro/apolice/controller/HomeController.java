package com.cadastro.apolice.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cadastro.apolice.util.Constants;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView index() {

		ModelAndView mv  = new ModelAndView(Constants.INDEX);
		
		return mv;
	}
}
