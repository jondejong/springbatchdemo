package com.objectpartners.sbdemo.persistant;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * JPA Mapped Game Entity
 */
@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Long id;

    @Column(name="time")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "visitor_team_id")
    private Team visitor;

    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Team home;

    @Column(name="visitor_score")
    private Integer visitorScore;

    @Column(name="home_score")
    private Integer homeScore;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getVisitor() {
        return visitor;
    }

    public void setVisitor(Team visitor) {
        this.visitor = visitor;
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
