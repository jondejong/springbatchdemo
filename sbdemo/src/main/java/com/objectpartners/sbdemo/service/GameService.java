package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.persistant.Game;

import java.util.List;

/**
 * Interface for accessing games
 */
public interface GameService {
    public void saveGames(List<? extends Game> games);
}
