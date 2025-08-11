package com.nathan.studentdashboard.model;

public class Grades {
    private String subject;
    private String grade;
    private String date;

    public Grades() {}

    public Grades(String subject, String grade, String date) {
        this.subject = subject;
        this.grade = grade;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}