package com.recallradar.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateTopicRequestDTO {
    @NotBlank(message = "Name is required")
    @Size(min=3, max=100, message = "Name must be between 3 and 100 characters")

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message = "Description is required")
    private String description;

    
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    @NotBlank(message = "Difficulty is required")
    private String difficulty;
    
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }

}
