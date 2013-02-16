package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.dao.TeamDao;
import com.objectpartners.sbdemo.persistant.Team;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * Implementation of TeamService
 */
@Transactional
public class TeamServiceImpl implements TeamService {

    private TeamDao teamDao;

    @Override
    public void saveTeams(Collection<? extends Team> teams) {
        for(Team team : teams) {
            teamDao.saveTeam(team);
        }
    }

    @Override
    public void resetStandings() {
        List<Team> teams = teamDao.findAll();
        for(Team team : teams) {
            team.setWinPercentage(0.0);
            team.setWins(0);
            team.setLosses(0);
        }
        saveTeams(teams);
    }

    @Override
    public Team findTeamByName(String name, String nickName) {
        return teamDao.find(name, nickName);
    }

    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }
}
