package com.techprimers.elastic.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.elastic.builder.SearchQueryBuilder;
import com.techprimers.elastic.model.Loadingpage;
import com.techprimers.elastic.model.Youtube;

	@RestController
	@RequestMapping("/rest/manual/search")
	public class ManualSearchResource {

	    @Autowired
	    private SearchQueryBuilder searchQueryBuilder;

	    @GetMapping(value = "/")
	    public List<Youtube> getAll(@ModelAttribute Loadingpage loadingpage) {
	    	int value = Integer.parseInt(loadingpage.getValue());
	    
	    	if(loadingpage.getValue()== "more")
	    	return searchQueryBuilder.getAll(loadingpage.getAttribute1(),loadingpage.getAttribute2(),value,700000);
	    	else
	    		return searchQueryBuilder.getAll(loadingpage.getAttribute1(),loadingpage.getAttribute2(),0,value);
	    	
	    		
	    }
	}
