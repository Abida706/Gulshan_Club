package com.example.gulshan_club.ClubMember.Model;

public class MemberMessaging {
    private String sender;
    private String content;
    private String timestamp;
    private String preview;
    private String search;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public MemberMessaging(String sender, String content, String timestamp, String preview, String search) {
        this.sender = sender;
        this.content = content;
        this.timestamp = timestamp;
        this.preview = preview;
        this.search = search;

    }
}
