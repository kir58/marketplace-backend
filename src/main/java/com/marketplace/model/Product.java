package com.marketplace.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity  // Обязательно добавьте эту аннотацию
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    @Id
    private String id;
    private String name;
    private String description;
    private String category;
    private double price;
    private Double oldPrice;
    private double rating;
    private int reviews;
    private String imageUrl;


    // Конструктор без параметров (для JPA)
    public Product() {}

    // Конструктор с параметрами
    public Product(String id, String name, String description, String category, double price, String imageUrl, Double oldPrice, double rating, int reviews) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.imageUrl = imageUrl;
        this.oldPrice = oldPrice;
        this.rating = rating;
        this.reviews = reviews;
    }

    // Геттеры и сеттеры
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
