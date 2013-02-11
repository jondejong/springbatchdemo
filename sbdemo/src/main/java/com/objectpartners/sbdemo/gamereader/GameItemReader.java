package com.objectpartners.sbdemo.gamereader;

import com.objectpartners.sbdemo.item.GameItem;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/11/13
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameItemReader implements ItemReader<GameItem>{

    @Override
    public GameItem read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        System.out.println("Reading in a game... booya!");
        return new GameItem();
    }
}
