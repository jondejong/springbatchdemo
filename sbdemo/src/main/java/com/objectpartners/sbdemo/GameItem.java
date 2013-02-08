package com.objectpartners.sbdemo;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/6/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameItem {
    private String date;
    private String visitingTeam;
    private String homeTeam;
    private String visitingTeamScore;
    private String homeTeamScore;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public void setVisitingTeam(String visitingTeam) {
        this.visitingTeam = visitingTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getVisitingTeamScore() {
        return visitingTeamScore;
    }

    public void setVisitingTeamScore(String visitingTeamScore) {
        this.visitingTeamScore = visitingTeamScore;
    }

    public String getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(String homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }
}
