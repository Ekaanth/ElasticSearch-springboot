package com.techprimers.elastic.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.elastic.model.Youtube;
import com.techprimers.elastic.repository.UsersRepository;

@RestController
@RequestMapping("/rest/search")
public class SearchResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/like/{likecount}")
    public List<Youtube> searchSalary(@PathVariable final String likecount) {
        return usersRepository.findBylikecount(likecount);
    }

    
    @GetMapping(value = "/all")
    public List<Youtube> searchAll() {
        List<Youtube> usersList = new ArrayList<>();
        Iterable<Youtube> userses = usersRepository.findAll();
        userses.forEach(usersList::add);
        return usersList;
    }
   
    
    
}
