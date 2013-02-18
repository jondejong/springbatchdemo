package com.objectpartners.sbdemo.dao;

import com.objectpartners.sbdemo.persistant.Team;

import java.util.List;

/**
 * DAO for JPA access to teams
 */
public interface TeamDao {

    public void saveTeam(Team team);
    public Team load(Long id);
    public Team find(String name, String nickName);
    public List<Team> findAll();
}
