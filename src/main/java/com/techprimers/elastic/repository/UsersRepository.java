package com.techprimers.elastic.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.techprimers.elastic.model.Youtube;

public interface UsersRepository extends ElasticsearchRepository<Youtube, String> {

	List<Youtube> findBylikecount(String likecount);
   
}
