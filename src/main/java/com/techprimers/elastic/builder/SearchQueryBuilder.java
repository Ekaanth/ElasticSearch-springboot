package com.techprimers.elastic.builder;

import java.util.List;

import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Component;

import com.techprimers.elastic.model.Youtube;

@Component
public class SearchQueryBuilder {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    public List<Youtube> getAll(String text, String value , int lower , int upper) {

//        QueryBuilder query = QueryBuilders.boolQuery()
//                .should(
//                        QueryBuilders.queryStringQuery(text)
//                                .lenient(true)
//                                .field("likecount")
//                                .field("favoriatecount")
//                ).should(QueryBuilders.queryStringQuery("*" + text + "*")
//                        .lenient(true)
//                        .field("likecount")
//                       .field("favoriatecount"));
        
    	QueryBuilder query = QueryBuilders.boolQuery()
    	        .should(
    	                 QueryBuilders.rangeQuery(text)
    	                .from(lower)
    	                .to(upper)
    	        )
    	        .should(
    	                 QueryBuilders.rangeQuery(value)
    	                .from(lower)
    	                .to(upper)
    	        );
        
        
        System.out.println("=================================");
        System.out.println(query);        
        System.out.println("=================================");
        NativeSearchQuery build = new NativeSearchQueryBuilder()
                .withQuery(query)
                .build();

        List<Youtube> userses = elasticsearchTemplate.queryForList(build, Youtube.class);

        return userses;
    }
}