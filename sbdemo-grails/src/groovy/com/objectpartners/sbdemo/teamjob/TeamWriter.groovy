package com.objectpartners.sbdemo.teamjob

import com.objectpartners.sbdemo.persistant.Team
import com.objectpartners.sbdemo.service.SbdemoService
import org.springframework.batch.item.ItemWriter

class TeamWriter implements ItemWriter<Team> {

    SbdemoService sbdemoService

    @Override
    void write(List<? extends Team> teams) throws Exception {
        println "Writing ${teams.size()} teams."
        sbdemoService.saveTeams(teams)
    }
}
