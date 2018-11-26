package com.poojj.funny.entity;

import javax.persistence.*;

@Entity
@Table(name = "userinfo")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "username",length = 20)
    private String username;

    @Column(name = "password",length = 20)
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
