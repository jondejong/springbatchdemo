package com.objectpartners.sbdemo.teamjob;

import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.TeamService;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Writes the teams to the database
 */
public class TeamWriter implements ItemWriter<Team> {

    private TeamService teamService;

    @Override
    public void write(List<? extends Team> teams) throws Exception {

        System.out.println("Writing " + teams.size() + " teams.");

        for(Team team : teams) {
            teamService.saveTeam(team);
        }

    }

    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }
}
