package com.objectpartners.sbdemo.service;

import com.objectpartners.sbdemo.persistant.PersistentGame;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/11/13
 * Time: 4:59 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GameService {


    public void saveGame(PersistentGame game);

    public void findTeamByName(String name, String nickName);

}
