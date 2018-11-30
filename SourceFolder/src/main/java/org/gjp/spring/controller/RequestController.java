package org.gjp.spring.controller;

import org.gjp.spring.domain.Request;
import org.gjp.spring.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestController {

	@Autowired
	public RequestService requestService;

	@RequestMapping("/request")
	public String newProduct(Model model) {
		model.addAttribute("request", new Request());
		return "request";
	}

	@RequestMapping(value = "/response", method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String saveProduct(@RequestBody Request request) {
		return requestService.response(request);
	}
	
	
}