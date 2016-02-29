package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "index";
	}

    @RequestMapping(value= "contactus" ,method = RequestMethod.GET)
    public String contactus(ModelMap model){
        return  "contactus";
    }

    @RequestMapping(value = "formability",method = RequestMethod.GET)
    public String formablility(ModelMap modelMap){
        return "formability";
    }

    @RequestMapping(value ="toollife" ,method =  RequestMethod.GET)
    public String toollife(ModelMap modelMap){
        return  "toollife";
    }



//    @RequestMapping(value = "")
}