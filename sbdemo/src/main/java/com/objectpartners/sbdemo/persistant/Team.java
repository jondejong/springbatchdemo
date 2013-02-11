package com.objectpartners.sbdemo.persistant;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: jondejong
 * Date: 2/6/13
 * Time: 9:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="nick_name")
    private String nickName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
