package com.techprimers.elastic.load;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.techprimers.elastic.model.ContentDetails;
import com.techprimers.elastic.model.Items;
import com.techprimers.elastic.model.MainJson;
import com.techprimers.elastic.model.Statistics;
import com.techprimers.elastic.model.Youtube;
import com.techprimers.elastic.repository.UsersRepository;

@Service
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    @Transactional
    @Scheduled(fixedRate=10000)
    public void loadAll() throws Exception{

        operations.putMapping(Youtube.class);
        System.out.println("Loading Data");
   	 usersRepository.save(getData());
        System.out.printf("Loading Completed");
        
    }
						
 
	 private List<Youtube> getData()  {
	    	
	    	System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 URL url = null;
			try {
				url = new URL("https://www.googleapis.com/youtube/v3/videos?part=contentDetails,statistics&chart=mostPopular&regionCode=In&maxResults=25&key=AIzaSyDHsEchtvchZpilJNf_jizUnxNjM15KFYg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     System.out.println(url);   
			 InputStreamReader reader = null;
			try {
				reader = new InputStreamReader(url.openStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 MainJson mainjson = new Gson().fromJson(reader, MainJson.class);
		        
		        
//		        System.out.println(">"+mainjson);
		       System.out.println("items"+mainjson.getItems());
		        Items[] item = mainjson.getItems();
		
//				ArrayList<Statistics> al =new ArrayList<>();
//				HashMap<String,String> hashmap = new HashMap<>();
		        
		        List<Youtube> youtube = new ArrayList<>();
				for(Items mj : item){ 
					if( mj.getStatistics() != null){
					System.out.println(mj.getId());
				    System.out.println(mj.getEtag());
					System.out.println( mj.getStatistics());
						
					   Statistics stat =mj.getStatistics();

					   ContentDetails details = mj.getContentDetails();
					   
					   youtube.add(new Youtube(mj.getKind(), mj.getEtag(), mj.getId(), details.getDuration() , details.getCaption(), stat.getViewCount(), stat.getLikeCount(), stat.getDislikeCount(), stat.getFavoriteCount(), stat.getCommentCount()));
					
					}
			}
	    	
			return youtube;
	 }
   
       
    }
