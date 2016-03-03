package com.icmetal.mvc;

import com.icmetal.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController extends BaseController{
//    @Autowired
//    private BaseService baseService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "index";
	}

    //跳转页面部分
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

    /**
     * 保存contactus
     * @param name
     * @param email
     * @param subject
     * @param message
     * @return
     */
    @RequestMapping(value = "saveContactus", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity saveContactus(@RequestParam("name") String name,
                                                      @RequestParam("email") String email,
                                                      @RequestParam("subject") String subject,
                                                      @RequestParam("message") String message){


        return successResult();
    }
}