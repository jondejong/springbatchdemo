package com.objectpartners.sbdemo.gamejob.step2

import com.objectpartners.sbdemo.persistant.Game
import com.objectpartners.sbdemo.persistant.Team
import com.objectpartners.sbdemo.service.SbdemoService
import org.springframework.batch.item.ItemProcessor

class StandingProcessor implements ItemProcessor<Game, Collection<Team>> {

    static boolean cleared = false

    SbdemoService sbdemoService

    @Override
    Collection<Team> process(Game game) throws Exception {
        println "Processing standing for $game"
        if (!cleared) {
            sbdemoService.resetStandings()
            cleared = true
        }
        //Need to do this because the HibernateCursorItemReader doesn't attach
        //the instance of the session
        if (!game.isAttached()) {
            game.attach()
        }
        sbdemoService.updateTeamStandings(game)
    }
}
