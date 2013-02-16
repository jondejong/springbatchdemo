package com.objectpartners.sbdemo.standingssjob;

import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.TeamService;
import org.springframework.batch.item.ItemWriter;

import java.util.Collection;
import java.util.List;

/**
 *
 */
public class StandingWriter implements ItemWriter<Collection<Team>> {

    private TeamService teamService;

    @Override
    public void write(List<? extends Collection<Team>> collections) throws Exception {
        for(Collection<Team> teams : collections) {
            teamService.saveTeams(teams);
        }
    }

    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }
}
