package com.objectpartners.sbdemo.gamereader;

import com.objectpartners.sbdemo.persistant.PersistentGame;
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
public class GameWriter implements ItemWriter<PersistentGame> {

    private GameService gameService;

    @Override
    public void write(List<? extends PersistentGame> persistentGames) throws Exception {

        System.out.println("Writing " + persistentGames.size() + " games.");

        for(PersistentGame game : persistentGames) {
            gameService.saveGame(game);
        }
    }

    @Autowired
    public void setGameService(GameService gameService) {
        this.gameService = gameService;
    }
}
