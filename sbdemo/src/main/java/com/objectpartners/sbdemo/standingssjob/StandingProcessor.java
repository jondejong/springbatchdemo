package com.objectpartners.sbdemo.standingssjob;

import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.TeamService;
import org.springframework.batch.item.ItemProcessor;

import java.util.Collection;
import java.util.HashSet;

/**
 *  Processor to update the standings
 */
public class StandingProcessor implements ItemProcessor<Game, Collection<Team>> {

    private TeamService teamService;

    private static boolean cleared = false;

    @Override
    public Collection<Team> process(Game game) throws Exception {
        Collection<Team> teams = new HashSet<Team>();

        if(!cleared) {
            teamService.resetStandings();
            cleared = true;
        }

        if(game.getHomeScore() > game.getVisitorScore()) {
            game.getHome().setWins(game.getHome().getWins() + 1);
            game.getVisitor().setLosses(game.getVisitor().getLosses() + 1);
        } else {
            game.getHome().setLosses(game.getHome().getLosses() + 1);
            game.getVisitor().setWins(game.getVisitor().getWins() + 1);
        }

        Double homeWinPercentege = (new Double(game.getHome().getWins()))/(new Double(game.getHome().getWins() + game.getHome().getLosses()));
        Double visitorWinPercentege = (new Double(game.getVisitor().getWins()))/(new Double(game.getVisitor().getWins() + game.getVisitor().getLosses()));

        game.getHome().setWinPercentage(homeWinPercentege);
        game.getVisitor().setWinPercentage(visitorWinPercentege);

        teams.add(game.getHome());
        teams.add(game.getVisitor());

        return teams;
    }

    public void setTeamService(TeamService teamService) {
        this.teamService = teamService;
    }
}
