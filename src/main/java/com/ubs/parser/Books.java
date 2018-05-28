package com.ubs.parser;

public class Books {

    public Books(String id, String author, String title, String genre, String publish_date, String description, float price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.publish_date = publish_date;
        this.description = description;
        this.price = price;
    }


    private String id = null;
    private String author = null;
    private String title = null;
    private String genre = null;
    private String publish_date = null;
    private String description = null;
    private float price = 0f;

    @Override
    public String toString() {
        return "ID: " + id + " Author: " + author +  " Title: " + title;
    }
}
