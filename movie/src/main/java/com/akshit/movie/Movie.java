package com.akshit.movie;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Movie {

    private int id;

    @NotEmpty(message = "Title cannot be empty")
    private String title;

    @Size(max = 200, message = "Description must be under 200 characters")
    private String description;

    @NotNull(message = "Rating is required")
    private Double rating;

    public Movie() {}

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
}
