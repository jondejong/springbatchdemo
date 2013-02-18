package com.objectpartners.sbdemo.teamjob;

import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.SbdemoService;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Writes the teams to the database
 */
public class TeamWriter implements ItemWriter<Team> {

    private SbdemoService sbdemoService;

    @Override
    public void write(List<? extends Team> teams) throws Exception {
        System.out.println("Writing " + teams.size() + " teams.");
        sbdemoService.saveTeams(teams);
    }

    public void setSbdemoService(SbdemoService sbdemoService) {
        this.sbdemoService = sbdemoService;
    }
}
