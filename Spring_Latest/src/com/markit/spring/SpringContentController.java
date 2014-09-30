package com.markit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringContentController {
	@Autowired UserDetails userDetails;
	@RequestMapping(value="/springcontent",
			method=RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	UserDetails getUser() {
		UserDetails userDetails = new UserDetails();
		userDetails.setUserName("Praveen");
		userDetails.setEmailId("praveen@gmail.com");
		return userDetails;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView adminPage() {
 
		ModelAndView model = new ModelAndView();		
		model.setViewName("angular");
 
		return model;
 
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView angularPage() {
 
		ModelAndView model = new ModelAndView();		
		model.setViewName("index");
 
		return model;
 
	}
	
		
}