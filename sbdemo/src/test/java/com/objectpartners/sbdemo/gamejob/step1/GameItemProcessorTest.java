package com.objectpartners.sbdemo.gamejob.step1;

import com.objectpartners.sbdemo.item.GameItem;
import com.objectpartners.sbdemo.persistant.Game;
import com.objectpartners.sbdemo.persistant.Team;
import com.objectpartners.sbdemo.service.SbdemoService;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Tests for GameItemProcessor
 */
public class GameItemProcessorTest {

    @Test
    public void testGameItemProcessor() {

        try {
            // Set up mock service
            SbdemoService sbdemoService = mock(SbdemoService.class);
            when(sbdemoService.findTeamByName("Nebraska", "Cornhuskers")).thenReturn(getMockedNebraska());
            when(sbdemoService.findTeamByName("Minnesota", "Golden Gophers")).thenReturn(getMockedMinnesota());

            // Create the GameItem
            GameItem gameItem = new GameItem();
            gameItem.setHomeTeamName("Nebraska");
            gameItem.setHomeTeamNickeName("Cornhuskers");
            gameItem.setHomeTeamScore(27);

            gameItem.setVisitingTeamName("Minnesota");
            gameItem.setVisitingTeamNickName("Golden Gophers");
            gameItem.setVisitingTeamScore(21);

            gameItem.setDate((new SimpleDateFormat("MM/dd/yyyy:HH:mm").parse("09/14/2013:12:00")));

            // Set up the processor to test
            GameItemProcessor gameItemProcessor = new GameItemProcessor();
            gameItemProcessor.setSbdemoService(sbdemoService);

            // Execute our test method
            Game game = gameItemProcessor.process(gameItem);

            // Assert
            assertNotNull(game);
            assertNotNull(game.getHome());
            assertEquals("Nebraska", game.getHome().getName());
            assertEquals("Cornhuskers", game.getHome().getNickName());

            assertNotNull(game.getVisitor());
            assertEquals("Minnesota", game.getVisitor().getName());
            assertEquals("Golden Gophers", game.getVisitor().getNickName());

            assertEquals(new Integer(27), game.getHomeScore());
            assertEquals(new Integer(21), game.getVisitorScore());

            assertNotNull(game.getDate());

            Calendar cal = Calendar.getInstance();
            cal.setTime(game.getDate());

            assertEquals(Calendar.SEPTEMBER, cal.get(Calendar.MONTH));
            assertEquals(14, cal.get(Calendar.DAY_OF_MONTH));
            assertEquals(2013, cal.get(Calendar.YEAR));
            assertEquals(12, cal.get(Calendar.HOUR_OF_DAY));
            assertEquals(0, cal.get(Calendar.MINUTE));

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    private Team getMockedNebraska() {
        Team team = new Team();
        team.setName("Nebraska");
        team.setNickName("Cornhuskers");
        team.setWins(11);
        team.setLosses(0);
        return team;
    }

    private Team getMockedMinnesota() {
        Team team = new Team();
        team.setName("Minnesota");
        team.setNickName("Golden Gophers");
        team.setWins(7);
        team.setLosses(6);
        return team;
    }
}
