package com.pawelczak;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	private String message = "Hello World";

	@RequestMapping("/")
	public String starter(Map<String, Object> model) {
		model.put("message", this.message);
		return "starter";
	}

}
