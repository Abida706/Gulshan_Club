package com.example.gulshan_club.Marketing_Manager.Model;

import java.time.LocalDate;

public class SocialMedia {
    private String postContent;
    private LocalDate schedule;

    public SocialMedia(String postContent, LocalDate schedule) {
        this.postContent = postContent;
        this.schedule = schedule;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public LocalDate getSchedule() {
        return schedule;
    }

    public void setSchedule(LocalDate schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "SocialMedia{" +
                "postContent='" + postContent + '\'' +
                ", schedule=" + schedule +
                '}';
    }
}
