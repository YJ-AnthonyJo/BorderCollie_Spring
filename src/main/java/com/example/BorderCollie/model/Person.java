package com.example.BorderCollie.model;

import javax.persistence.*;

@Entity
public class Person {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    // 어떻게 자동 생성할지 : 여기서는 자동으로 설정함.
    private Long id;
    @Column
    private String name;
    @Column
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
