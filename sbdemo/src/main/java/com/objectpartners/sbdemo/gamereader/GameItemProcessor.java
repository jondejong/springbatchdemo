package com.objectpartners.sbdemo.gamereader;

import com.objectpartners.sbdemo.item.GameItem;
import com.objectpartners.sbdemo.persistant.PersistentGame;
import com.objectpartners.sbdemo.persistant.Team;
import org.springframework.batch.item.ItemProcessor;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/6/13
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameItemProcessor implements ItemProcessor<GameItem, PersistentGame>{
    @Override
    public PersistentGame process(GameItem gameItem) throws Exception {
        System.out.println("Processing a game!");

        PersistentGame game = new PersistentGame();

        Team home = new Team();
        home.setName("Iowa");
        home.setNickName("Hawekeyes");

        game.setDate(new Date());
        game.setHome(home);

        return game;
    }
}
