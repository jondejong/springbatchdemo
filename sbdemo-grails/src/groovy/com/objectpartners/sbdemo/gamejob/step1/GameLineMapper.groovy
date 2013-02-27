package com.objectpartners.sbdemo.gamejob.step1

import com.objectpartners.sbdemo.item.GameItem
import org.springframework.batch.item.file.LineMapper

import java.text.ParseException
import java.text.SimpleDateFormat

class GameLineMapper implements LineMapper<GameItem> {


    @Override
    GameItem mapLine(String line, int lineNumber) throws Exception {
        GameItem game = new GameItem()

        String[] tokens = line.split(',')

        if (tokens.length != 7) return null

        game.homeTeamName = tokens[0]
        game.homeTeamNickName = tokens[1]
        game.homeTeamScore = tokens[2].toInteger()
        game.visitingTeamName = tokens[3]
        game.visitingTeamNickName = tokens[4]
        game.visitingTeamScore = tokens[5].toInteger()
        game.date = parseDate(tokens[6])

        return game
    }

    Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat('MM/dd/yyyy:HH:mm')
        return format.parse(dateString)
    }
}
