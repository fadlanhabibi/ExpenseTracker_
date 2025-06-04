package com.example.expensetracker.model;

public class Expense {
    private String id;
    private String title;
    private String description;
    private double amount;
    private String date;
    private String userId;

    public Expense() {
        // Default constructor required for Firebase
    }

    public Expense(String title, String description, double amount, String date, String userId) {
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.date = date;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}