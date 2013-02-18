package com.objectpartners.sbdemo.dao;

import com.objectpartners.sbdemo.persistant.Team;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Implementation of TeamDao with JPA
 */
public class TeamDaoImpl implements TeamDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveTeam(Team team) {
        entityManager.merge(team);
    }

    @Override
    public Team load(Long id) {
        return entityManager.find(Team.class, id);
    }

    @Override
    public Team find(String name, String nickName) {

        Team exampleTeam = new Team();
        exampleTeam.setName(name);
        exampleTeam.setNickName(nickName);

        Example example = Example.create(exampleTeam).excludeZeroes();

        Session session = (Session) entityManager.getDelegate();
        Criteria criteria = session.createCriteria(Team.class).add(example);

        List<Team> teams = criteria.list();

        if(teams.size() != 1)  {
            return null;
        }

        return teams.get(0);
    }

    @Override
    public List<Team> findAll() {
        return entityManager.createQuery("select t from Team t").getResultList();
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
