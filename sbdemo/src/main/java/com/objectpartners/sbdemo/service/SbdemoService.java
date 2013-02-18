package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.persistant.Team;

import java.util.Collection;
import java.util.List;

/**
 * Services for SB Demo
 */
public interface SbdemoService {
    public void saveGames(List<? extends Game> games);
    public void saveTeams(Collection<? extends Team> teams);
    public void resetStandings();
    public Team findTeamByName(String name, String nickName);
    public List<Team> updateTeamStandings(Game game);
}
