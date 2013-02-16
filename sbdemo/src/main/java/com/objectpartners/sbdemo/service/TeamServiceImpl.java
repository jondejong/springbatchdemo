package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.dao.TeamDao;
import com.objectpartners.sbdemo.persistant.Team;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of TeamService
 */
@Transactional
public class TeamServiceImpl implements TeamService {

    private TeamDao teamDao;

    @Override
    public void saveTeam(Team team) {
       teamDao.saveTeam(team);
    }

    @Override
    public Team findTeamByName(String name, String nickName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }
}
