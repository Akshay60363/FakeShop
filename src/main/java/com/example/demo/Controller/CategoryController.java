package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ApiService.IApiService;
@RestController
@RequestMapping("api/v1/")
public class CategoryController {
	IApiService apiService;
	public CategoryController(IApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("category")
	public List<String> getAllCategory() throws IOException{
		return this.apiService.makeGetRequest();
		
	}

}
