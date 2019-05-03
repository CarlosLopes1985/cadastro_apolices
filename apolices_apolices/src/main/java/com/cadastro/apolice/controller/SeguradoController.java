package com.cadastro.apolice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cadastro.apolice.model.Segurado;
import com.cadastro.apolice.util.Constants;

@Controller
@RequestMapping(value="/segurado")
public class SeguradoController {
	
	@RequestMapping(value="/index" , method = RequestMethod.GET)
	public ModelAndView novo(@ModelAttribute("segurado") Segurado segurado) {
		
		ModelAndView mv = new ModelAndView(Constants.CADASTROCLIENTES);
		segurado = new Segurado();
		return mv;
	}
	

	@RequestMapping(value="/novo" , method = RequestMethod.POST)
	public ModelAndView novoSegurado(@ModelAttribute("segurado") Segurado segurado) {
		
	//	ModelAndView mv = new ModelAndView(Constants.CADASTROPRODUTOS);
		System.out.println(segurado.toString());
			
		return novo(null);
	}
}
