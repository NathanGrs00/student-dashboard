package com.nathan.studentdashboard.model;

public class Deadline {
    private String id;
    private String title;
    private String dueDate;
    private String subject;

    public Deadline() {}

    public Deadline(String id, String title, String dueDate, String subject) {
        this.id = id;
        this.title = title;
        this.dueDate = dueDate;
        this.subject = subject;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDueDate() { return dueDate; }
    public void setDueDate(String dueDate) { this.dueDate = dueDate; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
}