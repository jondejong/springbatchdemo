package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.persistant.Team;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for accessing teams
 */
public interface TeamService {

    public void saveTeam(Team team);
    public Team findTeamByName(String name, String nickName);

}
