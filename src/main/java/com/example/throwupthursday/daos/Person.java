package com.example.throwupthursday.daos;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Person {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;

    public Person() {}

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
