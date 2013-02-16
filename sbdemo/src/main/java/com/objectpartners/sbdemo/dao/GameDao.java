package com.objectpartners.sbdemo.dao;

import com.objectpartners.sbdemo.persistant.Game;

/**
 * JPA ingterface for access Games
 */
public interface GameDao {

    public void saveGame(Game game);
}
