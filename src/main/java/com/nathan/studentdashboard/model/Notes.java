package com.nathan.studentdashboard.model;

public class Notes {
    private String id;
    private String content;
    private String createdAt;

    public Notes() {}

    public Notes(String id, String content, String createdAt) {
        this.id = id;
        this.content = content;
        this.createdAt = createdAt;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getCreatedAt() { return createdAt; }
    public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
}