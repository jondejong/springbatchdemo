package com.objectpartners.sbdemo.gamejob.step1;

import com.objectpartners.sbdemo.item.GameItem;
import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.SbdemoService;
import org.springframework.batch.item.ItemProcessor;

/**
 * Implementation of GameItemProcessor to translate GameItems into games
 */
public class GameItemProcessor implements ItemProcessor<GameItem, Game>{

    private SbdemoService sbdemoService;

    @Override
    public Game process(GameItem gameItem) throws Exception {
        System.out.println("Processing a game: " + gameItem.toString());

        Game game = new Game();

        Team home = sbdemoService.findTeamByName(gameItem.getHomeTeamName(), gameItem.getHomeTeamNickeName());
        Team visitor = sbdemoService.findTeamByName(gameItem.getVisitingTeamName(), gameItem.getVisitingTeamNickName());

        game.setDate(gameItem.getDate());
        game.setHome(home);
        game.setVisitor(visitor);
        game.setHomeScore(gameItem.getHomeTeamScore());
        game.setVisitorScore(gameItem.getVisitingTeamScore());

        return game;
    }

    public void setSbdemoService(SbdemoService sbdemoService) {
        this.sbdemoService = sbdemoService;
    }
}
