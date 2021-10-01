package com.swp.bmi.user;

import java.time.LocalDate;

public class User {
    private Long id;
    private String name;
    private String eMail;
    private LocalDate dob;
    private Integer age;
    private Integer size;
    private Integer weight;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String name, String eMail, LocalDate dob, Integer age, Integer size, Integer weight) {
        this.id = id;
        this.name = name;
        this.eMail = eMail;
        this.dob = dob;
        this.age = age;
        this.size = size;
        this.weight = weight;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", size=" + size +
                ", weight=" + weight +
                '}';
    }
}
