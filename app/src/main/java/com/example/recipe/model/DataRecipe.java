package com.example.recipe.model;

public class DataRecipe {
    String menu, category, description;

    public DataRecipe (){}

    public DataRecipe(String menu, String category, String description) {
        this.menu = menu;
        this.category = category;
        this.description = description;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
