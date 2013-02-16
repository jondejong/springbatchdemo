package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.persistant.Team;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service for accessing teams
 */
public interface TeamService {

    public void saveTeams(List<? extends Team> teams);
    public Team findTeamByName(String name, String nickName);

}
