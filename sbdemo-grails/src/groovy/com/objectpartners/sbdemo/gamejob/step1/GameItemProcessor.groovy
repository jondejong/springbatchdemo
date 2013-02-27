package com.objectpartners.sbdemo.gamejob.step1

import com.objectpartners.sbdemo.item.GameItem
import com.objectpartners.sbdemo.persistant.Game
import com.objectpartners.sbdemo.persistant.Team
import com.objectpartners.sbdemo.service.SbdemoService
import org.springframework.batch.item.ItemProcessor

class GameItemProcessor implements ItemProcessor<GameItem, Game> {

    SbdemoService sbdemoService

    @Override
    public Game process(GameItem gameItem) throws Exception {
        println "Processing a game: $gameItem"

        Game game = new Game()

        Team homeTeam = sbdemoService.findTeamByName(gameItem.homeTeamName, gameItem.homeTeamNickName)
        Team visitingTeam = sbdemoService.findTeamByName(gameItem.visitingTeamName, gameItem.visitingTeamNickName)

        game.with {
            date = gameItem.date
            home = homeTeam
            visitor = visitingTeam
            homeScore = gameItem.homeTeamScore
            visitorScore = gameItem.visitingTeamScore
        }

        return game
    }
}
