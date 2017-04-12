package com.techprimers.elastic;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.google.gson.Gson;
import com.techprimers.elastic.model.ContentDetails;
import com.techprimers.elastic.model.Items;
import com.techprimers.elastic.model.MainJson;
import com.techprimers.elastic.model.Statistics;
import com.techprimers.elastic.model.Youtube;

@SpringBootApplication
@EnableScheduling
public class SpringElasticDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringElasticDemoApplication.class, args);
	}
	
	
}
