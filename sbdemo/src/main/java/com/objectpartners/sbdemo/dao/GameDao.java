package com.objectpartners.sbdemo.dao;

import com.objectpartners.sbdemo.persistant.Game;

/**
 * DAO interface for access Games
 */
public interface GameDao {
    public void saveGame(Game game);
}
