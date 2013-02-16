package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.dao.GameDao;
import com.objectpartners.sbdemo.persistant.Game;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * JPA Implementation of GameService
 */
@Transactional
public class GameServiceImpl implements GameService {

    private GameDao gameDao;

    @Override
    public void saveGames(List<? extends Game> games) {
        for(Game game : games) {
            gameDao.saveGame(game);
        }
    }

    public void setGameDao(GameDao gameDao) {
        this.gameDao = gameDao;
    }
}
