package com.uniwill.lms.web.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value="/main")
	public ModelAndView main(HttpServletRequest request,
			                 HttpServletResponse response,
			                 ModelAndView modelAndView) throws Throwable {
		
		HttpSession session = request.getSession();
		
		if(session.getAttribute("sMemNo") == null) {
			
			modelAndView.setViewName("redirect:login");
		} else {
			
			modelAndView.setViewName("main");
		}
		
		return modelAndView;
	}
}
