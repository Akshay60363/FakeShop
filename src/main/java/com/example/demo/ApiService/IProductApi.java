package com.example.demo.ApiService;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.DTO.ProductDTO;

@Component
public interface IProductApi {
	public List<ProductDTO> getAllProducts() throws IOException;

}
