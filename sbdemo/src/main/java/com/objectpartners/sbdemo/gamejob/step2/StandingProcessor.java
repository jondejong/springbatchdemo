package com.objectpartners.sbdemo.gamejob.step2;

import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.SbdemoService;
import org.springframework.batch.item.ItemProcessor;

import java.util.Collection;
import java.util.HashSet;

/**
 *  Processor to update the standings
 */
public class StandingProcessor implements ItemProcessor<Game, Collection<Team>> {

    private SbdemoService sbdemoService;

    private static boolean cleared = false;

    @Override
    public Collection<Team> process(Game game) throws Exception {
        if(!cleared) {
            sbdemoService.resetStandings();
            cleared = true;
        }
        return sbdemoService.updateTeamStandings(game);
    }

    public void setSbdemoService(SbdemoService sbdemoService) {
        this.sbdemoService = sbdemoService;
    }
}
