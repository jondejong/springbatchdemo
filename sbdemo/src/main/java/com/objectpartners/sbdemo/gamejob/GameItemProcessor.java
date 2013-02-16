package com.objectpartners.sbdemo.gamejob;

import com.objectpartners.sbdemo.item.GameItem;
import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.persistant.Team;
import org.springframework.batch.item.ItemProcessor;

import java.util.Date;

/**
 * Implementation of GameItemProcessor to translate GameItems into games
 */
public class GameItemProcessor implements ItemProcessor<GameItem, Game>{
    @Override
    public Game process(GameItem gameItem) throws Exception {
        System.out.println("Processing a game!");

        Game game = new Game();

        Team home = new Team();
        home.setName("Iowa");
        home.setNickName("Hawekeyes");

        game.setDate(new Date());
        game.setHome(home);

        return game;
    }
}
