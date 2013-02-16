package com.objectpartners.sbdemo.persistant;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * JPA Mapped Team Entity
 */
@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "id")
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
