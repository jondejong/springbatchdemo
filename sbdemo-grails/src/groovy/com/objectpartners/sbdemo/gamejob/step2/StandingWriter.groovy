package com.objectpartners.sbdemo.gamejob.step2

import com.objectpartners.sbdemo.persistant.Team
import com.objectpartners.sbdemo.service.SbdemoService
import org.springframework.batch.item.ItemWriter

class StandingWriter implements ItemWriter<Collection<Team>> {

    SbdemoService sbdemoService

    @Override
    void write(List<? extends Collection<Team>> collections) throws Exception {
        println "Processing standings for teams: $collections"
        collections.each { teams ->
            sbdemoService.saveTeams(teams)
        }
    }
}
