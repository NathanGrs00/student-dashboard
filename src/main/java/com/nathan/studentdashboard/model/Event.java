package com.nathan.studentdashboard.model;

public class Event {
    private String id;
    private String title;
    private String subject;
    private String startTime;
    private String endTime;

    public Event() {}

    public Event(String id, String title, String subject, String startTime, String endTime) {
        this.id = id;
        this.title = title;
        this.subject = subject;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getStartTime() { return startTime; }
    public void setStartTime(String startTime) { this.startTime = startTime; }

    public String getEndTime() { return endTime; }
    public void setEndTime(String endTime) { this.endTime = endTime; }
}