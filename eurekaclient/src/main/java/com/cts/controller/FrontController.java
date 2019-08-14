package com.cts.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.cts.service.DiscoverService;
import com.cts.service.FindService;
import com.cts.service.SearchService;


@RequestMapping("/movies")
public class FrontController 
{
	@RequestMapping("/trendingmovies")
	public void trendingmovies()
	{
		FindService findService = new FindService();
		findService.trendingmovies();
	}
	@RequestMapping("/upcomingmovies")
	public void upcomingmovies()
	{
		DiscoverService discoverService = new DiscoverService();
		discoverService.upcomingmovies();
	}
	@RequestMapping("/searchmovies/person")
	public void byActorName()
	{
		SearchService searchService = new SearchService();
		searchService.byActorName();
	}
	@RequestMapping("/searchmovies/movie")
	public void byMovieName()
	{
		SearchService searchService = new SearchService();
		searchService.byMovieName();
	}
}
