package com.example.demo.ApiService;

import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.example.demo.DTO.ResponseCategoryDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@Service
public class ApiService implements IApiService{
	@Value("${apiUrl}")
	private String apiUrl;
	
	private final OkHttpClient client = new OkHttpClient();
	private final ObjectMapper objectMapper = new ObjectMapper();
	@Override
	public List<String> makeGetRequest() throws IOException {
	    String fullUrl = apiUrl + "/products/category"; // if you're using base URL
	    Request request = new Request.Builder().url(fullUrl).build();

	    try (Response response = client.newCall(request).execute()) {
	        if (response != null && response.isSuccessful()) {
	            String jsonResponse = response.body().string();
	            ResponseCategoryDTO dto = objectMapper.readValue(jsonResponse, ResponseCategoryDTO.class);
	            return dto.getCategories();
	        } else {
	            throw new IOException("Unexpected Response: " + (response != null ? response.code() : "null"));
	        }
	    }
	}


}
