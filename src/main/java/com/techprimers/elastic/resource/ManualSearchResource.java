package com.techprimers.elastic.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.elastic.builder.SearchQueryBuilder;
import com.techprimers.elastic.model.Youtube;

	@RestController
	@RequestMapping("/rest/manual/search")
	public class ManualSearchResource {

	    @Autowired
	    private SearchQueryBuilder searchQueryBuilder;

	    @GetMapping(value = "/{number}")
	    public List<Youtube> getAll(@PathVariable final String number) {
	        return searchQueryBuilder.getAll(number,"viewcount",400000,700000);
	    }
	}

