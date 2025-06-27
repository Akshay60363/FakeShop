package com.example.demo.DTO;

import java.util.List;

import lombok.Data;

@Data
public class ResponseProductDTO {
	private String status;
	private String message;
	private List<ProductDTO> products;

}
