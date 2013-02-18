package com.objectpartners.sbdemo.dao;

import com.objectpartners.sbdemo.persistant.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Implementation of GameDao with JPA
 */
public class GameDaoImpl implements GameDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveGame(Game game) {
        entityManager.merge(game);
    }
}
