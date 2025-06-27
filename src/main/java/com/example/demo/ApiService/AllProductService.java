package com.example.demo.ApiService;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ProductDTO;
import com.example.demo.DTO.ResponseProductDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.example.demo.DTO.ResponseProductDTO;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
@Service

public class AllProductService implements IProductApi{
	@Value("${apiUrl}")
	private String apiUrl;
	private final ObjectMapper objectMapper = new ObjectMapper();
	private final OkHttpClient client = new OkHttpClient();
	
	@Override
	public List<ProductDTO> getAllProducts() throws IOException{
		String fullUrl = apiUrl + "/products";
		Request request = new Request.Builder().url(fullUrl).build();

		    try (Response response = client.newCall(request).execute()) {
		        if (response != null && response.isSuccessful()) {
		            String jsonResponse = response.body().string();
		            ResponseProductDTO dto = objectMapper.readValue(jsonResponse, ResponseProductDTO.class);
		            return dto.getProducts();
		        } else {
		            throw new IOException("Unexpected Response: " + (response != null ? response.code() : "null"));
		        }
		    }
	}
}

	

