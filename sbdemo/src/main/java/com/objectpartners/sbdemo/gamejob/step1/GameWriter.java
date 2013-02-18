package com.objectpartners.sbdemo.gamejob.step1;

import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.service.SbdemoService;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Write games to the database
 */
public class GameWriter implements ItemWriter<Game> {

    private SbdemoService sbdemoService;

    @Override
    public void write(List<? extends Game> games) throws Exception {
        sbdemoService.saveGames(games);
    }

    public void setSbdemoService(SbdemoService sbdemoService) {
        this.sbdemoService = sbdemoService;
    }
}
