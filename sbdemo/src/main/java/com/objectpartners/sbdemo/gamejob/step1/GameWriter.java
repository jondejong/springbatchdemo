package com.objectpartners.sbdemo.gamejob.step1;

import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.service.GameService;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Write games to the database
 */
public class GameWriter implements ItemWriter<Game> {

    private GameService gameService;

    @Override
    public void write(List<? extends Game> games) throws Exception {
        gameService.saveGames(games);
    }

    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }
}
