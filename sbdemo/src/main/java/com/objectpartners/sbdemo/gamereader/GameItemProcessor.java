package com.objectpartners.sbdemo.gamereader;

import com.objectpartners.sbdemo.GameItem;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/6/13
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameItemProcessor<GameItem> implements ItemProcessor<GameItem, GameItem>{
    @Override
    public GameItem process(GameItem gameItem) throws Exception {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
