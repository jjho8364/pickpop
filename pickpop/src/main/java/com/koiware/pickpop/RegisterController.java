package com.koiware.pickpop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koiware.pickpop.dto.LoginDto;

@Controller
@RequestMapping("/sboard")
public class RegisterController {
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void registerGET() {
		
	}
}
