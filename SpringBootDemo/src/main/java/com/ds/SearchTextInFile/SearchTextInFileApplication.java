package com.ds.SearchTextInFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SearchTextInFileApplication extends SpringBootServletInitializer
{
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
	{
		return application.sources(SearchTextInFileApplication.class);
	}

	public static void main(String[] args) 
	{
		SpringApplication.run(SearchTextInFileApplication.class, args);
	}
}
