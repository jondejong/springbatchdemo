package com.objectpartners.sbdemo.item;

import java.util.Date;

/**
 * Class to store one line from the game CSV file.
 */
public class GameItem {
    private Date date;
    private String visitingTeamName;
    private String visitingTeamNickName;
    private String homeTeamName;
    private String homeTeamNickeName;
    private Integer visitingTeamScore;
    private Integer homeTeamScore;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVisitingTeamName() {
        return visitingTeamName;
    }

    public void setVisitingTeamName(String visitingTeamName) {
        this.visitingTeamName = visitingTeamName;
    }

    public String getVisitingTeamNickName() {
        return visitingTeamNickName;
    }

    public void setVisitingTeamNickName(String visitingTeamNickName) {
        this.visitingTeamNickName = visitingTeamNickName;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamNickeName() {
        return homeTeamNickeName;
    }

    public void setHomeTeamNickeName(String homeTeamNickeName) {
        this.homeTeamNickeName = homeTeamNickeName;
    }

    public Integer getVisitingTeamScore() {
        return visitingTeamScore;
    }

    public void setVisitingTeamScore(Integer visitingTeamScore) {
        this.visitingTeamScore = visitingTeamScore;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    @Override
    public String toString() {

        if(null == homeTeamName) {
            return "GameItem not initialized.";
        }

        String winningTeam = homeTeamScore > visitingTeamScore ? homeTeamName + " " + homeTeamNickeName : visitingTeamName + " " + visitingTeamNickName;
        String losingTeam =  homeTeamScore > visitingTeamScore ? visitingTeamName + " " + visitingTeamNickName : homeTeamName + " " + homeTeamNickeName;
        Integer winningScore = homeTeamScore > visitingTeamScore ? homeTeamScore : visitingTeamScore;
        Integer losingScore = homeTeamScore > visitingTeamScore ? visitingTeamScore : homeTeamScore;

        String location = homeTeamScore > visitingTeamScore ? "at home" : "away from home";

        return "The " + winningTeam + " defeated the " + losingTeam + " " + winningScore + " to " + losingScore + " " + location + ".";
    }
}