package com.objectpartners.sbdemo.persistant;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/6/13
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class PersistentGame {

    private Date date;
    private Team visitors;
    private Team home;
    private Integer visitorScore;
    private Integer homeScore;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getVisitors() {
        return visitors;
    }

    public void setVisitors(Team visitors) {
        this.visitors = visitors;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Integer getVisitorScore() {
        return visitorScore;
    }

    public void setVisitorScore(Integer visitorScore) {
        this.visitorScore = visitorScore;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }
}
