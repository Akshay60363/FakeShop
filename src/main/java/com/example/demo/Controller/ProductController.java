package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ApiService.IProductApi;
import com.example.demo.DTO.ProductDTO;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	private final IProductApi iProductApi;
	public ProductController(IProductApi iProductApi) {
		this.iProductApi = iProductApi;
	}
	@GetMapping("/AllProducts")
	public List<ProductDTO> allProduct() throws IOException {
		return iProductApi.getAllProducts();
	}
	
	

}
