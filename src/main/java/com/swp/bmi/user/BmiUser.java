package com.swp.bmi.user;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class BmiUser {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String name;
    private String eMail;
    private LocalDate dob;
    @Transient
    private Integer age;
    private Integer height;
    private Integer weight;

    public BmiUser() {
    }

    public BmiUser(String name, String eMail, LocalDate dob, Integer height, Integer weight) {
        this.name = name;
        this.eMail = eMail;
        this.dob = dob;
        this.height = height;
        this.weight = weight;
    }

    public BmiUser(Long id, String name, String eMail, LocalDate dob, Integer height, Integer weight) {
        this.id = id;
        this.name = name;
        this.eMail = eMail;
        this.dob = dob;
        this.height = height;
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

        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer size) {
        this.height = size;
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
                ", size=" + height +
                ", weight=" + weight +
                '}';
    }
}
