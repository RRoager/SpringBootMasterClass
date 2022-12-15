package com.roager.myfirstwebapp.todo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Todo {
    @Id
    @GeneratedValue
    private int Id;
    private String username;
    //@Size(min = 1, message = "Please enter something in description")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public Todo() {
    }

    public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
        Id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ID: " + Id + "\n" +
                "Username: " + username + "\n" +
                "Description: " + description + "\n" +
                "Target Date: " + targetDate + "\n" +
                "Done: " + done + "\n";
    }
}
