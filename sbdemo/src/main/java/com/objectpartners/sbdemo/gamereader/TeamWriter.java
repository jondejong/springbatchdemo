package com.objectpartners.sbdemo.gamereader;

import com.objectpartners.sbdemo.dao.TeamDao;
import com.objectpartners.sbdemo.persistant.PersistentGame;
import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.GameService;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/11/13
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class TeamWriter implements ItemWriter<Team> {

    private TeamDao teamDao;

    @Override
    public void write(List<? extends Team> teams) throws Exception {

        System.out.println("Writing " + teams.size() + " teams.");

        for(Team team : teams) {
            teamDao.saveTeam(team);
        }

    }

    public void setTeamDao(TeamDao teamDao) {
        this.teamDao = teamDao;
    }
}
