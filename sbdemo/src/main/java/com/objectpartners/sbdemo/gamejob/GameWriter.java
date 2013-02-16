package com.objectpartners.sbdemo.gamejob;

import com.objectpartners.sbdemo.persistant.Game;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Write games to the database
 */
public class GameWriter implements ItemWriter<Game> {
    @Override
    public void write(List<? extends Game> games) throws Exception {

    }
}
