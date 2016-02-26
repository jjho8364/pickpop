package com.koiware.pickpop;

import java.util.Date;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koiware.pickpop.domain.SellerVO;
import com.koiware.pickpop.dto.LoginDto;
import com.koiware.pickpop.service.SellerService;

@Controller
@RequestMapping("/seller")
public class SellerController {
	@Inject private SellerService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDto dto) {
		
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void loginPOST(LoginDto dto, HttpSession session, Model model ) throws Exception {
		SellerVO vo = service.login(dto);
		
		if(vo==null) return;
		
		if (dto.isUseCookie()) {

		      int amount = 60 * 60 * 24 * 7;

		      Date sessionLimit = new Date(System.currentTimeMillis() + (1000 * amount));

		      service.keepLogin(vo.getIdseller(), session.getId(), sessionLimit);
		}
		
		model.addAttribute("sellerVO", vo);
	}
	
}
