package com.example.demo.ApiService;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface IApCategoryiService {
	 public List<String> makeGetRequest() throws IOException ;

}
