package com.objectpartners.sbdemo.gamejob.step1;

import com.objectpartners.sbdemo.item.GameItem;
import static  org.junit.Assert.*;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Tests for GameLineMapper
 */
public class GameLineMapperTest {

    @Test
    public void testLineMap() {
        String line = "Nebraska,Cornhuskers,33,Minnesota,Golden Gophers,3,09/14/2013:12:00";

        try {
            GameItem game = (new GameLineMapper()).mapLine(line, 1);
            assertNotNull(game);
            assertEquals("Nebraska", game.getHomeTeamName());
            assertEquals("Cornhuskers", game.getHomeTeamNickeName());
            assertEquals("Minnesota", game.getVisitingTeamName());
            assertEquals("Golden Gophers", game.getVisitingTeamNickName());
            assertEquals(new Integer(33), game.getHomeTeamScore());
            assertEquals(new Integer(3), game.getVisitingTeamScore());
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
}
