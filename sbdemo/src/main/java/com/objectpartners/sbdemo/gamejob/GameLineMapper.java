package com.objectpartners.sbdemo.gamejob;

import com.objectpartners.sbdemo.item.GameItem;
import org.springframework.batch.item.file.LineMapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Maps one line from the games data CSV file into an object
 */
public class GameLineMapper implements LineMapper<GameItem> {

    @Override
    public GameItem mapLine(String line, int lineNumber) throws Exception {
        GameItem game = new GameItem();

        String[] tokens = line.split(",");

        if(tokens.length != 7) {
            return null;
        }

        int index = 0;
        game.setHomeTeamName(tokens[index++]);
        game.setHomeTeamNickeName(tokens[index++]);
        game.setHomeTeamScore(Integer.parseInt(tokens[index++]));
        game.setVisitingTeamName(tokens[index++]);
        game.setVisitingTeamNickName(tokens[index++]);
        game.setVisitingTeamScore(Integer.parseInt(tokens[index++]));
        game.setDate(parseDate(tokens[index++]));

        return game;

    }

    private Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy:HH:mm");

        return format.parse(dateString);
    }

}
