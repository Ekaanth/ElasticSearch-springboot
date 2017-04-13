package com.techprimers.elastic.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techprimers.elastic.model.Loadingpage;

@Controller
public class pages {
	
	@RequestMapping("/page")
    public String search(Model model){
    	model.addAttribute("loadpage", new Loadingpage());
    	return "search";
    }
}
