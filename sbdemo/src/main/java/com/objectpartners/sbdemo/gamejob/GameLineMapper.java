package com.objectpartners.sbdemo.gamejob;

import com.objectpartners.sbdemo.item.GameItem;
import org.springframework.batch.item.file.LineMapper;

/**
 * Maps one line from the games data CSV file into an object
 */
public class GameLineMapper implements LineMapper<GameItem> {

    @Override
    public GameItem mapLine(String line, int lineNumber) throws Exception {
        GameItem game = new GameItem();

        String[] tokens = line.split(",");



        return game;

    }
}
