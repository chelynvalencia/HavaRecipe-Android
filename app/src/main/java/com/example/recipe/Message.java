package com.example.recipe;

public class Message {

    private String id;
    private String name;
    private String email;
    private String recipe;
    private String message;

    public Message(String id, String name, String email, String recipe, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.recipe = recipe;
        this.message = message;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
