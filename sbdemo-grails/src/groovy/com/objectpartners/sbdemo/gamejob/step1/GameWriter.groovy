package com.objectpartners.sbdemo.gamejob.step1

import com.objectpartners.sbdemo.persistant.Game
import com.objectpartners.sbdemo.service.SbdemoService
import org.springframework.batch.item.ItemWriter

class GameWriter implements ItemWriter<Game> {

    SbdemoService sbdemoService

    @Override
    void write(List<? extends Game> games) throws Exception {
        sbdemoService.saveGames(games)
    }
}
