package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.persistant.Team;

import java.util.Collection;
import java.util.List;

/**
 * Service for accessing teams
 */
public interface TeamService {

    public void saveTeams(Collection<? extends Team> teams);
    public void resetStandings();
    public Team findTeamByName(String name, String nickName);

}
