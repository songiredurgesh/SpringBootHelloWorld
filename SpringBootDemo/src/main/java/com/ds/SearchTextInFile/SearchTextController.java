package com.ds.SearchTextInFile;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchTextController 
{

		@RequestMapping("/")
		public String welcome(Map<String, Object>model)
		{
			String message = "Hello Boot";
			model.put("message",message);
			return "welcome";
		}
}
