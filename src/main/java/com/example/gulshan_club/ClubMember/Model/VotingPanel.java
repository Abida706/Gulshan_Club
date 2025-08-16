package com.example.gulshan_club.ClubMember.Model;

public class VotingPanel {
    private String pollTitle;
    private String selectedOption;

    public String getPollTitle() {
        return pollTitle;
    }

    public void setPollTitle(String pollTitle) {
        this.pollTitle = pollTitle;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public VotingPanel(String pollTitle, String selectedOption) {
        this.pollTitle = pollTitle;
        this.selectedOption = selectedOption;


    }
}
