package com.objectpartners.sbdemo.dao;

import com.objectpartners.sbdemo.persistant.Team;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/15/13
 * Time: 9:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class TeamDaoImpl implements TeamDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveTeam(Team team) {

        entityManager.merge(team);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
