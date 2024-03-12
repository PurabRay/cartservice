package com.example.carts;
import lombok.Getter;
import lombok.Setter;
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String imageUrl;
}
