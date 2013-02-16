package com.objectpartners.sbdemo.dao;

import com.objectpartners.sbdemo.persistant.Team;

/**
 * DAO for JPA access to teams
 */
public interface TeamDao {

    public void saveTeam(Team team);
    public Team find(String name, String nickName);
}
