package com.rb.rpi.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by rahul on 22-3-17.
 */

@Entity
@Table(name = "PERSON")
@Getter
@Setter
@ToString
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    Long id;
    @Column(name = "NAME")
    String name;
    @Column(name = "LAST_NAME")
    String lastName;

    @Column(name = "AGE")
    Integer age;
}
