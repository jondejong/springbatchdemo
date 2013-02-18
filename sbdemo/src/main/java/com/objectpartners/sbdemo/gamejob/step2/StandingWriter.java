package com.objectpartners.sbdemo.gamejob.step2;

import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.SbdemoService;
import org.springframework.batch.item.ItemWriter;

import java.util.Collection;
import java.util.List;

/**
 * Item writer to write updated teams to the database after their
 * standings have been recalculated
 */
public class StandingWriter implements ItemWriter<Collection<Team>> {

    private SbdemoService sbdemoService;

    @Override
    public void write(List<? extends Collection<Team>> collections) throws Exception {
        for(Collection<Team> teams : collections) {
            sbdemoService.saveTeams(teams);
        }
    }

    public void setSbdemoService(SbdemoService sbdemoService) {
        this.sbdemoService = sbdemoService;
    }
}
