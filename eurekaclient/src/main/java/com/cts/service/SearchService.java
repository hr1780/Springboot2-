package com.cts.service;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class SearchService 
{
	public void byActorName()
	{
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.set("APIKey", "12343b9c442643a0292f6cc5972c77e9");
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			String resourceURL = "https://api.themoviedb.org/3/person/550?api_key=12343b9c442643a0292f6cc5972c77e9";
			HttpEntity<String> entity = new HttpEntity(headers);
			
			ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
			//MovieSummary movieSummary = restTemplate.getForObject(resourceURL, MovieSummary.class);
			System.out.println(response);

			//return new Movie(movieSummary.getId(),movieSummary.getTitle(), movieSummary.getOverview());
	}
	public void byMovieName()
	{
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.set("APIKey", "12343b9c442643a0292f6cc5972c77e9");
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			String resourceURL = "https://api.themoviedb.org/3/trending/all/day?api_key=12343b9c442643a0292f6cc5972c77e9";
			HttpEntity<String> entity = new HttpEntity(headers);
			
			ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
			//MovieSummary movieSummary = restTemplate.getForObject(resourceURL, MovieSummary.class);
			System.out.println(response);

			//return new Movie(movieSummary.getId(),movieSummary.getTitle(), movieSummary.getOverview());
	}
	
}
