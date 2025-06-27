package com.example.demo.DTO;

import lombok.Data;

@Data
public class ProductDTO {
	private Integer id;
	private String title;
	private String image;
	private Integer price;
	private String description;
	private String brand;
	private String model;
	private String color;
	private String category;
	private Integer discount;
	private Boolean onSale;
	private Boolean popular;

}
